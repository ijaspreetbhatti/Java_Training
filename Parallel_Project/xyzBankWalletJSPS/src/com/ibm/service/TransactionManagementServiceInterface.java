package com.ibm.service;

public interface TransactionManagementServiceInterface {
	String depositAmount(long accountNumber, long amount);

	String withdrawAmount(long accountNumber, long amount);

	String fundTransfer(long srcAccountNumber, long trgtAccountNumber, long amount);
}
