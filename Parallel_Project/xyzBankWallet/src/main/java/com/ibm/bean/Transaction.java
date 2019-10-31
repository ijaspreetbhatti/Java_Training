package com.ibm.bean;

public class Transaction {
	private long amount;
	private String date, type;
	private long transactionId;

	public Transaction(long transactionId, long amount, String date, String type) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.date = date;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transaction [amount=" + amount + ", date=" + date + ", type=" + type + ", transactionId="
				+ transactionId + "]";
	}

	public long getAmount() {
		return amount;
	}

	public String getDate() {
		return date;
	}

	public String getType() {
		return type;
	}

	public long getTransactionId() {
		return transactionId;
	}
}
