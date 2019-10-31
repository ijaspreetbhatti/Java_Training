package com.ibm.training;

public class SimpleEngineer implements Engineer {

	String location;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void workForWages() {
		System.out.println("I am a simple engineer at " + getLocation());		
	}

}
