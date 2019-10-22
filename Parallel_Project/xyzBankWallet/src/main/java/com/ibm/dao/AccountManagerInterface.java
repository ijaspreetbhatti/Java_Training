package com.ibm.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ibm.bean.Transaction;

public interface AccountManagerInterface {
	long createAccount(String name, long phoneNumber, String address) throws SQLException;

	long getBalance(long accountNumber) throws SQLException;

	ArrayList<Transaction> getTransactions(long accountNumber) throws SQLException;

	boolean checkAccount(long accountNumber) throws SQLException;
}
