package com.ibm.takehome.dao;

import com.ibm.takehome.bean.Product;

public interface IProductDAO {
	Product getProductDetails (String productCode);
}
