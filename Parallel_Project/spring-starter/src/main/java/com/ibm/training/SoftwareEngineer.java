package com.ibm.training;

public class SoftwareEngineer {
	
	String eName;
	
	Integer eId;
	

	public SoftwareEngineer(String eName, Integer eId) {
		this.eName = eName;
		this.eId = eId;
	}


	public String geteName() {
		return eName;
	}


	public Integer geteId() {
		return eId;
	}


	void workForWages() {
		System.out.println(geteName() + ", " + geteId());
	}
	
}
