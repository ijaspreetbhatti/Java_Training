package com.ibm.dao;

import java.sql.SQLException;

public interface TransactionManagerInterface {

	public String withdrawAmount(long accountNumber, long amount) throws SQLException;

	public String depositAmount(long accountNumber, long amount) throws SQLException;

	public String registerTransaction(long amount, String date, String type, long accountNumber) throws SQLException;

}
