package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.MenDtls;

public class MenDAOImpl implements MenDAO {

	private Connection conn;
	
	
	
	public MenDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}



	@Override
	public boolean addMens(MenDtls m) {
		boolean f=false;
	try {
		String sql="insert into mens_details(brand,description,quantity,price,discount,size,category,photo) values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, m.getBrand());
		ps.setString(2, m.getDescription());
		ps.setString(3, m.getQuantity());
		ps.setString(4, m.getPrice());
		ps.setString(5, m.getDiscount());
		ps.setString(6, m.getSize());
		ps.setString(7, m.getCategory());
		ps.setString(8, m.getPhotoName());
		
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
	public List<MenDtls> getMensProduct() {
		List<MenDtls> list=new ArrayList<MenDtls>();
		MenDtls p=null;
		try {
			String sql="select * from mens_details where category=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "Men");
			
			ResultSet rs=ps.executeQuery();
			int i=1;
			while(rs.next() && i<=400)
			{
			p=new MenDtls();
			p.setId(rs.getInt(1));
			p.setBrand(rs.getString(2));
			p.setDescription(rs.getString(3));
			p.setQuantity(rs.getString(4));
			p.setPrice(rs.getString(5));
			p.setDiscount(rs.getString(6));
			p.setSize(rs.getString(7));
			p.setCategory(rs.getString(8));
			p.setPhotoName(rs.getString(9));
			list.add(p);
			i++;
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
