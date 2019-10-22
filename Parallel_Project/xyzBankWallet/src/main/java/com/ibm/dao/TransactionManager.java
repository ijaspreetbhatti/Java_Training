package com.ibm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionManager implements TransactionManagerInterface {

	Connection dbCon;
	PreparedStatement stmt;

	public TransactionManager() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		this.dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/xyzbankwallet", "root", "");
	}

	@Override
	public String depositAmount(long accountNumber, long amount) throws SQLException {
		long balance = 0;

		stmt = dbCon.prepareStatement("select * from accounts where accountNumber=?", ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		stmt.setLong(1, accountNumber);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			balance = rs.getInt("balance") + amount;
			rs.updateLong("balance", balance);
			rs.updateRow();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			registerTransaction(amount, formatter.format(date), "debit", accountNumber);
		}
		return "New Balance: " + balance;
	}

	@Override
	public String withdrawAmount(long accountNumber, long amount) throws SQLException {
		long balance = 0;

		stmt = dbCon.prepareStatement("select * from accounts where accountNumber=?", ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		stmt.setLong(1, accountNumber);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			balance = rs.getInt("balance");
			if (balance >= amount) {
				balance -= amount;
				rs.updateLong("balance", balance);
				rs.updateRow();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Date date = new Date();
				registerTransaction(amount, formatter.format(date), "credit", accountNumber);
			} else {
				return "Not Enough Balance!!";
			}
		}
		return "Withdrawl Successful \nNew Balance: " + balance;

	}

	@Override
	public String registerTransaction(long amount, String date, String type, long accountNumber) throws SQLException {
		stmt = dbCon.prepareStatement(
				"INSERT INTO `transactions` (`amount`, `date`, `type`, `accountNumber`) VALUES (?, ?, ?, ?) ");
		stmt.setLong(1, amount);
		stmt.setString(2, date);
		stmt.setString(3, type);
		stmt.setLong(4, accountNumber);
		stmt.execute();
		return "Success";
	}

}
