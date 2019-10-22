package com.ibm.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.ibm.bean.Transaction;

class AccountManagerTest {
	
	AccountManager accountManager;
	
	@Test
	void testCreateAccount() throws ClassNotFoundException, SQLException {
		accountManager = new AccountManager();
		// Have to refer database to know what would be the new account 
		assertEquals(107, accountManager.createAccount("James", 8888877888l, "New York"));
	}

	@Test
	void testGetBalance() throws ClassNotFoundException, SQLException {
		accountManager = new AccountManager();
		assertEquals(0, accountManager.getBalance(107));
	}

	@Test
	void testGetTransactions() throws SQLException, ClassNotFoundException {
		accountManager = new AccountManager();
		assertEquals(null, accountManager.getTransactions(107));
	}

	@Test
	void testCheckAccount() throws ClassNotFoundException, SQLException {
		accountManager = new AccountManager();
		assertEquals(true, accountManager.checkAccount(107));
	}

}
