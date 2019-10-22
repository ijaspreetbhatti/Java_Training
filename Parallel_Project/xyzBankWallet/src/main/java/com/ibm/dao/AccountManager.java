package com.ibm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ibm.bean.Transaction;

public class AccountManager implements AccountManagerInterface {

	Connection dbCon;
	PreparedStatement stmt;

	public AccountManager() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		this.dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/xyzbankwallet", "root", "");
	}

	@Override
	public long createAccount(String name, long phoneNumber, String address) throws SQLException {
		stmt = dbCon.prepareStatement("insert into accounts(name, address, phoneNumber, balance) values(?,?,?,0)");
		stmt.setString(1, name);
		stmt.setString(2, address);
		stmt.setLong(3, phoneNumber);
		stmt.execute();
		stmt = dbCon.prepareStatement("select MAX(accountNumber) from  accounts");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			return rs.getInt(1);
		}
		return -1;
	}

	@Override
	public long getBalance(long accountNumber) throws SQLException {
		stmt = dbCon.prepareStatement("select balance from accounts where accountNumber=?");
		stmt.setLong(1, accountNumber);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			return rs.getInt(1);
		}
		return 0;
	}

	@Override
	public ArrayList<Transaction> getTransactions(long accountNumber) throws SQLException {
		ArrayList<Transaction> transactionsList = new ArrayList<>();

		stmt = dbCon.prepareStatement("select * from transactions where accountNumber=?");
		stmt.setLong(1, accountNumber);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			long transactionId = rs.getLong("id");
			long amount = rs.getLong("amount");
			String date = rs.getString("date");
			String type = rs.getString("type");
			transactionsList.add(new Transaction(transactionId, amount, date, type));
		}
		return transactionsList;
	}

	@Override
	public boolean checkAccount(long accountNumber) throws SQLException {
		int rows = 0;

		stmt = dbCon.prepareStatement("select * from accounts where accountNumber=?");
		stmt.setLong(1, accountNumber);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			rows++;
		}
		if (rows == 1)
			return true;
		return false;
	}

}
