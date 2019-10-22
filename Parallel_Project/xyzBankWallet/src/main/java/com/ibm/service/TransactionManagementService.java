package com.ibm.service;

import java.sql.SQLException;

import com.ibm.dao.TransactionManager;

public class TransactionManagementService implements TransactionManagementServiceInterface {

	@Override
	public String depositAmount(long accountNumber, long amount) {
		String message = "Failed!! Try again later.";
		try {
			message = new TransactionManager().depositAmount(accountNumber, amount);
		} catch (ClassNotFoundException | SQLException e) {
			message = "Can't connect to server!!";
		}
		return message;
	}

	@Override
	public String withdrawAmount(long accountNumber, long amount) {
		String message = "Failed!! Try again later.";
		try {
			message = new TransactionManager().withdrawAmount(accountNumber, amount);
		} catch (ClassNotFoundException | SQLException e) {
			message = "Can't connect to server!!";
		}
		return message;
	}

	@Override
	public String fundTransfer(long srcAccountNumber, long trgtAccountNumber, long amount) {
		String message = "";
		if (new AccountManagementService().isAnAccount(trgtAccountNumber)) {
			message = withdrawAmount(srcAccountNumber, amount);
			if (message.equals("Not Enough Balance!!") || message.equals("Can't connect to server!!")) {
				return message;
			} else {
				message = depositAmount(trgtAccountNumber, amount);
				if (message.contains("New Balance: ")) {
					return "Transfer Successful!!\n" + message;
				}
			}
		} else {
			return "Reciever doesn't exist!!";
		}
		return message;
	}

};