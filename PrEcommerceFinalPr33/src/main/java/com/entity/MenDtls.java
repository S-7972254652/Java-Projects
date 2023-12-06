package com.entity;

public class MenDtls {
private int id;
private String brand;
private String description;
private String quantity;
private String price;
private String discount;
private String size;
private String category;
private String photoName;

public MenDtls() {
	super();
	// TODO Auto-generated constructor stub
}

public MenDtls(String brand,String description, String quantity, String price, String discount, String size,String category, String photoName) {
	super();
	this.brand = brand;
	this.description = description;
	this.quantity = quantity;
	this.price = price;
	this.discount = discount;
	this.size = size;
	this.category=category;
	this.photoName = photoName;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}
public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
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

public String getDiscount() {
	return discount;
}

public void setDiscount(String discount) {
	this.discount = discount;
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}
public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public String getPhotoName() {
	return photoName;
}

public void setPhotoName(String photoName) {
	this.photoName = photoName;
}

@Override
public String toString() {
	return "MenDtls [id=" + id + ", brand=" + brand + ", description=" + description + ", quantity=" + quantity
			+ ", price=" + price + ", discount=" + discount + ", size=" + size + ", category=" + category
			+ ", photoName=" + photoName + "]";
}






}
