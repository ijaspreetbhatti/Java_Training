package com.ibm.training;

public class AutoEngineer implements Engineer {
	
	Address address1;
	
	public AutoEngineer(Address address1) {
		this.address1 = address1;
	}
	
	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	public void workForWages() {
		System.out.println(address1.getLocation() + ", " + address1.getPinCode());
	}
	
	
}
