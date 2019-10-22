package com.ibm.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransactionTest {

	Transaction testObj = new Transaction(1, 899, "2019-12-12", "credit");

	@Test
	void testGetAmount() {
		assertEquals(899, testObj.getAmount());
	}

	@Test
	void testGetDate() {
		assertEquals("2019-12-12", testObj.getDate());
	}

	@Test
	void testGetType() {
		assertEquals("credit", testObj.getType());
	}

	@Test
	void testGetTransactionId() {
		assertEquals(1, testObj.getTransactionId());
	}

}
