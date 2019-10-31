package com.ibm.takehome.service;

public interface IValidationService {
	Boolean validateProductId(String productId);
	public Boolean validateQuantity(String quantity);
}
