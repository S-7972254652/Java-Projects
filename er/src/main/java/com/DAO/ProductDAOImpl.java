package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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


	@Override
	public List<ProductDtls> getAllProducts() {
		List<ProductDtls> list=new ArrayList<ProductDtls>();
		ProductDtls p=null;
		
		try {
			String sql="select * from product_details";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				p=new ProductDtls();
				p.setProductId(rs.getInt(1));
				p.setProductname(rs.getString(2));
				p.setPrice(rs.getString(3));
				p.setProductCategory(rs.getString(4));
				p.setStatus(rs.getString(5));
				p.setPhotoName(rs.getString(6));
				p.setEmail(rs.getString(7));
				p.setQuantity(rs.getString(8));
				p.setDescription(rs.getString(9));
				list.add(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}


	@Override
	public ProductDtls getProductById(int id) {
		ProductDtls p=null;
		
		try {
			String sql="select * from product_details where productId=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,id);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				p=new ProductDtls();
				p.setProductId(rs.getInt(1));
				p.setProductname(rs.getString(2));
				p.setPrice(rs.getString(3));
				p.setProductCategory(rs.getString(4));
				p.setStatus(rs.getString(5));
				p.setPhotoName(rs.getString(6));
				p.setEmail(rs.getString(7));
				p.setQuantity(rs.getString(8));
				p.setDescription(rs.getString(9));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return p;
	}


	@Override
	public boolean updateEditProducts(ProductDtls p) {
	    boolean f = false;
	    try {
	        String sql = "update product_details set productname=?, price=?, productCategory=?, status=?, quantity=?, description=? where productId=?";
	        PreparedStatement ps = conn.prepareStatement(sql);

	        ps.setString(1, p.getProductname());
	        ps.setString(2, p.getPrice());
	        ps.setString(3, p.getProductCategory());
	        ps.setString(4, p.getStatus());
	        ps.setString(5, p.getQuantity());
	        ps.setString(6, p.getDescription());
	        ps.setInt(7, p.getProductId()); // Use getProductId to get the ID

	        int i = ps.executeUpdate();
	        if (i == 1) {
	            f = true;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return f;
	}


	@Override
	public boolean deleteProducts(int id) {
	boolean f=false;
	try {
		String sql="delete from product_details where productId=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, id);
		int i=ps.executeUpdate();
		if(i==1)
		{
			f=true;
		}
	} catch (Exception e) {
		
	}
	
	
		return f;
	}


}
