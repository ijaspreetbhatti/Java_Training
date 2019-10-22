package com.ibm.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class TransactionManagerTest {
	
	TransactionManager transactionManager;
	
	@Test
	void testDepositAmount() throws ClassNotFoundException, SQLException {
		transactionManager = new TransactionManager();
		assertEquals("New Balance: 100", transactionManager.depositAmount(107, 100));
	}

	@Test
	void testWithdrawAmount() throws ClassNotFoundException, SQLException {
		transactionManager = new TransactionManager();
		assertEquals("Withdrawl Successful \nNew Balance: 0", transactionManager.withdrawAmount(107, 100));
	}
	
	@Test
	void testWithdrawAmount2() throws ClassNotFoundException, SQLException {
		transactionManager = new TransactionManager();
		assertEquals("Not Enough Balance!!", transactionManager.withdrawAmount(107, 100));
	}

	@Test
	void testRegisterTransaction() throws ClassNotFoundException, SQLException {
		transactionManager = new TransactionManager();
		assertEquals("Success", transactionManager.registerTransaction(0, "Test", "Test", 106));
	}

}
