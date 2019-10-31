package com.ibm.takehome.bean;

public class Product {
	private String productName, productCategory, productDescription;
	private Integer productId, productPrice;
	
	public Product() {
	}
	
	public Product(Integer productId, String productName, String productCategory, Integer productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}

	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
