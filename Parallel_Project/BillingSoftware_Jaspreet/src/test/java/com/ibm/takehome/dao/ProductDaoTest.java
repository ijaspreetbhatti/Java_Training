package com.ibm.takehome.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ibm.takehome.bean.Product;

@Component("productDaoTest")
@TestInstance(Lifecycle.PER_CLASS)
class ProductDaoTest {
	
	ProductDao responseDao;
	Product response;

	@BeforeAll
	void init() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		this.responseDao = context.getBean("productDao", ProductDao.class);
		this.response = this.responseDao.getProductDetails("0001");
		context.close();
	}

	@Test
	void getProductPriceTest() {
		assertEquals(65000, response.getProductPrice());
	}

	@Test
	void getProductNameTest() {
		assertEquals("iPhone 11", response.getProductName());
	}

	@Test
	void getProductDescription() {
		assertEquals("Apple iPhone 11 64GB", response.getProductDescription());
	}

	@Test
	void getProductCategoryTest() {
		assertEquals("Smartphone", response.getProductCategory());
	}

}
