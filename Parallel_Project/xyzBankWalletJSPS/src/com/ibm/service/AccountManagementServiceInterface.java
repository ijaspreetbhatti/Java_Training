package com.ibm.service;

import java.util.ArrayList;

import com.ibm.bean.Transaction;

public interface AccountManagementServiceInterface {
	String createAccount(String name, long phoneNumber, String address);

	long getBalance(long accountNumber);

	ArrayList<Transaction> getTransactions(long accountNumber);

	boolean isAnAccount(long accountNumber);
}
