package com.entity;

public class ProductDtls {
private int productid;
private String name;
private String 	description;
private String price;
private String 	quantity;
private String photo;

public ProductDtls() {
	super();
	// TODO Auto-generated constructor stub	
}
public ProductDtls(String name,String description, String price,String quantity, String photo ) {
	super();
	this.name = name;
	this.description = description;
	this.price = price;
	this.quantity = quantity;
	this.photo = photo;
}
public int getProductId() {
	return productid;
}
public int setProductId(int productId) {
	return this.productid = productId;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}

public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}

public String getPhoto() {
	return photo;
}
public void setPhoto (String photo) {
	this.photo = photo;
}
@Override
public String toString() {
	return "ProductDtls [productid=" + productid + ", name=" + name + ", description=" + description + ", price="
			+ price + ", quantity=" + quantity + ", photo=" + photo + "]";
}



}
