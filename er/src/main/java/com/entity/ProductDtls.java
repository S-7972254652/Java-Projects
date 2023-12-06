package com.entity;

public class ProductDtls {
private int productId;
private String productname;
private String price;
private String productCategory;
private String status;
private String photoName;
private String 	email;
private String 	quantity;
private String 	description;
public ProductDtls() {
	super();
	// TODO Auto-generated constructor stub	
}
public ProductDtls(String productname, String price, String productCategory, String status, String photoName,
		String email, String quantity, String description) {
	super();
	this.productname = productname;
	this.price = price;
	this.productCategory = productCategory;
	this.status = status;
	this.photoName = photoName;
	this.email = email;
	this.quantity = quantity;
	this.description = description;
}
public int getProductId() {
	return productId;
}
public int setProductId(int productId) {
	return this.productId = productId;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getPhotoName() {
	return photoName;
}
public void setPhotoName(String photoName) {
	this.photoName = photoName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "ProductDtls [productId=" + productId + ", productname=" + productname + ", price=" + price
			+ ", productCategory=" + productCategory + ", status=" + status + ", photoName=" + photoName + ", email="
			+ email + ", quantity=" + quantity + ", description=" + description + "]";
}

}
