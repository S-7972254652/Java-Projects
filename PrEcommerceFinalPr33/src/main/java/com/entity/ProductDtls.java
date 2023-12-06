package com.entity;

public class ProductDtls {
private int productId;
private String productname;
private String productCategory;
private String 	quantity;
private String price;
private String 	description;
private String status;
private String photoName;
//private String 	email;
public ProductDtls() {
	super();
	// TODO Auto-generated constructor stub	
}
public ProductDtls(String productname,String productCategory,String quantity, String price,String description,  String status, String photoName,
		String email ) {
	super();
	this.productname = productname;
	this.productCategory = productCategory;
	this.quantity = quantity;
	this.price = price;
	this.description = description;
	this.status = status;
	this.photoName = photoName;
//	this.email = email;
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
public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
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
//public String getEmail() {
//	return email;
//}
//public void setEmail(String email) {
//	this.email = email;
//}
@Override
public String toString() {
	return "ProductDtls [productId=" + productId + ", productname=" + productname + ", productCategory=" + productCategory + ", Quantity=" + quantity + ", price=" + price +", description=" + description +", status=" + status +", photoName=" + photoName +"]";
}

}
