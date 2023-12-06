package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.ProductDtls;

public class ProductDAOImpl implements ProductDAO{

	private Connection conn;
	
	public ProductDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}


	@Override
	public boolean addProducts(ProductDtls p) {
		boolean f=false;
	try {
		String sql="insert into product_details(Productname,Price,productCategory,status,Photo,email,Quantity,description) values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, p.getProductname());
		ps.setString(2,p.getPrice() );
		ps.setString(3, p.getProductCategory());
		ps.setString(4, p.getStatus());
		ps.setString(5, p.getPhotoName());
		ps.setString(6, p.getEmail());
		ps.setString(7, p.getQuantity());
		ps.setString(8, p.getDescription());
		
		
		int i=ps.executeUpdate();
		if(i==1) {
			f=true;
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		return f;
	}

}
