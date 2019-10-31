package com.ibm.takehome.service;

import com.ibm.takehome.bean.Product;

public interface IProductService {
	Product getProductDetails (String productCode);
}
