package com.ibm.takehome.service;

import org.springframework.stereotype.Service;

@Service("validationService")
public class ValidationService implements IValidationService {

	public Boolean validateProductId(String productId) {
		Boolean response = false;
		if((productId.length())==4) {
    		response = true;
    	}
		try {
			Integer.parseInt(productId);
		}catch(Exception e) {
			response = false;
		}
		return response;
	}
	
	public Boolean validateQuantity(String quantity) {
		Boolean response = false;
		try {
			Integer.parseInt(quantity);
		}catch(Exception e) {
			return false;
		}
		if(Integer.parseInt(quantity)>0) {
    		response = true;
    	}
		
		return response;
	}

}
