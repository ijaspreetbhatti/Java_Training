package com.ibm.training;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("anEngineer")
@PropertySource("classpath:test.properties")
public class AnnotationEngineer implements Engineer {
	
	@Value("${userName}")
    String uName;
	
	@Autowired
	@Qualifier("address")
	Address address;
	
//	@Autowired
//	@Qualifier("address2")
	
	@Resource(name = "address2") // A JSR 250 Spec annotation : Can be used parameterless as well
	Address address2;
	
//	@Autowired
//	public AnnotationEngineer(Address address) {
//		this.address = address;
//	}

	public Address getAddress() {
		return address;
	}

//	Autowire it automatically
	//@Autowired
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public void workForWages() {
		
System.out.println("My address details : " + address.getLocation() + ", " + address.getPinCode());		
System.out.println("My address2 details : " + address2.getLocation() + ", " + address2.getPinCode());		
	}
	
	
	@PreDestroy
	void atLast() {
		System.out.println("Called at the time of destroying");
	}
	
	@PostConstruct
	void atStart() {
		System.out.println("Called at first");
	}

}
