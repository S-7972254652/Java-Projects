package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private String name;
private String password;
private String email;
private String mobile;



public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public Product(String name, String password, String email, String mobile) {
	super();
	this.name = name;
	this.password = password;
	this.email = email;
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Product [name=" + name + ", password=" + password + ", email=" + email + ", mobile=" + mobile + "]";
}

}
