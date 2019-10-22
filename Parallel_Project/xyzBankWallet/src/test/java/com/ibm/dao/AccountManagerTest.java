package com.ibm.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.ibm.bean.Transaction;

class AccountManagerTest {
	
	@Test
	void testCreateAccount() throws ClassNotFoundException, SQLException {
		AccountManager accountManager = new AccountManager();
	}

	@Test
	void testGetBalance() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTransactions() {
		fail("Not yet implemented");
	}

	@Test
	void testCheckAccount() {
		fail("Not yet implemented");
	}

}
