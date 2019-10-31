package com.ibm.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ibm.bean.Transaction;
import com.ibm.dao.AccountManager;

public class AccountManagementService implements AccountManagementServiceInterface {

	@Override
	public String createAccount(String name, long phoneNumber, String address) {
		long accountNumber = -1;
		try {
			accountNumber = (new AccountManager().createAccount(name, phoneNumber, address));
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		if (accountNumber == -1) {
			return "Account Creation Failed! Try Again Later!!!";
		}
		return "Congratulations, " + name + " your account has been created with Account Number: " + accountNumber;
	}

	@Override
	public long getBalance(long accountNumber) {
		long balance = -1;
		try {
			balance = new AccountManager().getBalance(accountNumber);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return balance;
	}

	@Override
	public ArrayList<Transaction> getTransactions(long accountNumber) {
		ArrayList<Transaction> transactionsList = null;
		try {
			transactionsList = new AccountManager().getTransactions(accountNumber);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return transactionsList;
	}

	@Override
	public boolean isAnAccount(long accountNumber) {
		boolean isAnAccount = false;
		try {
			isAnAccount = new AccountManager().checkAccount(accountNumber);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return isAnAccount;
	}

}
