package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;

public class UserDAOImpl implements UserDAO {
	private Connection conn;

	public UserDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean userRegister(User us) {
		boolean f = false;
		try {
			String sql = "insert into user(name,password,email,mobile) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, us.getName());
			ps.setString(2, us.getPassword());
			ps.setString(3, us.getEmail());
			ps.setString(4, us.getMobile());

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
   	public User login(String email, String password) {
   		User us=null;
   		try {
   			String sql="select * from user where email=? and password=?";
   			PreparedStatement ps=conn.prepareStatement(sql);
   			ps.setString(1, email);
   			ps.setString(2, password);
   			
   			ResultSet rs=ps.executeQuery();
   			while(rs.next())
   			{
   				us=new User();
   				us.setId(rs.getInt(1));
   				us.setName(rs.getString(2));
   				us.setPassword(rs.getString(3));
   				us.setEmail(rs.getString(4));
   				us.setMobile(rs.getString(5));
   			
   				
   				
   			
   			}
   				
   				
   			
   		} catch (Exception e) {
   			e.printStackTrace();
   		}
   		return us;
   	}
}

