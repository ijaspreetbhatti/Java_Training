package com.ibm.training;

public class NetworkEngineer {
	
	Address address1;
	Address address2;
	
	
	

	public Address getAddress1() {
		return address1;
	}



	public void setAddress1(Address address1) {
		this.address1 = address1;
	}



	public Address getAddress2() {
		return address2;
	}



	public void setAddress2(Address address2) {
		this.address2 = address2;
	}



	void workForWages() {
	System.out.println("My address details : " + address1.getLocation() + ", "+ address1.getPinCode());	
	System.out.println("My Secondary address details : " + address2.getLocation() + ", "+ address2.getPinCode());	
	}

}
