package com.ibm.training;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Demonstrating initializing collections here
public class CivilEngineer implements InitializingBean, DisposableBean {
	
	List<Address> addresses;

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	void workForWages() {
		for(Address address : addresses) {
			System.out.println(address.getLocation() + ", " + address.getPinCode());
		}
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Put your starting code here for CivilEngineer here");
		
	}

	public void destroy() throws Exception {
		System.out.println("CivilEngineer Bean cleared");
		
	}
}
