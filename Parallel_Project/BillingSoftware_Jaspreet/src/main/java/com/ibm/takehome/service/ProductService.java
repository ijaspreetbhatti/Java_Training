package com.ibm.takehome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.takehome.bean.Product;
import com.ibm.takehome.dao.ProductDao;

@Service("productService")
public class ProductService implements IProductService{
	
	@Autowired
	ProductDao dao;

	public Product getProductDetails(String productCode) {
		return dao.getProductDetails(productCode);
	}

}
