package com.ibm.training;

public class User {
	
	User(){
		
	}
	
	Integer accountNumber;
	
	String userName, userAddress;

	public User(Integer accountNumber, String userName, String userAddress) {
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.userAddress = userAddress;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	@Override
	public String toString() {
		return this.getUserName() + ", " +this.getUserAddress();
	}

}
