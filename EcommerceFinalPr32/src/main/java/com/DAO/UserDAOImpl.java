package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DB.DBConnect;
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
            // Disable autocommit
            conn.setAutoCommit(false);

            String sql = "insert into user(name,email,password,mobile) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, us.getName());
            ps.setString(2, us.getEmail());
            ps.setString(3, us.getPassword());
            ps.setString(4, us.getMobile());

//            UserDAOImpl dao=new UserDAOImpl(DBConnect.getConn());
//            boolean f1=dao.userRegister(us);
            
            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
                // Commit the transaction
                conn.commit();
            } else {
                // Rollback the transaction if not successful
                conn.rollback();
            }

        } catch (Exception e) {
            e.printStackTrace();
            try {
                // Rollback the transaction in case of an exception
                conn.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                // Enable autocommit after the transaction
                conn.setAutoCommit(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
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
   				us.setMobile(rs.getString(4));
   				us.setPassword(rs.getString(5));
   				
   				
   				
   			
   			}
   				
   				
   			
   		} catch (Exception e) {
   			e.printStackTrace();
   		}
   		return us;
   	}
	public boolean checkPassword(int id,String ps) {
		boolean f=false;
		
		try {
			String sql="select * from user where id=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2, ps);
			
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	public boolean updateProfile(User us) {
		boolean f=false;
		try {
			String sql="update user set name=?,email=?,mobile=? where id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, us.getName());
			ps.setString(2, us.getEmail());
			ps.setString(3, us.getMobile());
			ps.setInt(4, us.getId());
			
			
			int i=ps.executeUpdate();
			if(i==1)
			{
				f=true;
			}
		} catch (Exception e) {
		e.printStackTrace();	
		}
		
		
		return f;
	}
}
