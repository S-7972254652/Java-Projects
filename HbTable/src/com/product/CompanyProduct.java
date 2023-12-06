package com.product;

public class CompanyProduct {

private int productId;
private String productName;
private String productPrice;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductPrice() {
	return productPrice;
}
public void setProductPrice(String productPrice) {
	this.productPrice = productPrice;
}
public CompanyProduct(int productId, String productName, String productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
}
public CompanyProduct() {
	super();
	// TODO Auto-generated constructor stub
}



}
