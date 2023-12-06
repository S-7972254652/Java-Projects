package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entity.User;

public class UserDAOImpl implements UserDAO {
    private Connection conn;

    public UserDAOImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean userRegister(User us) {
        boolean f = false;
        try {
            String sql = "INSERT INTO register(firstname, lastname, email, password, cpassword) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, us.getFirstname());
            ps.setString(2, us.getLastname());
            ps.setString(3, us.getEmail());
            ps.setString(4, us.getPassword());
            ps.setString(5, us.getCpassword());

            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception as needed, log the error, etc.
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return f;
    }

	@Override
	public User login(String email, String password) {
		User us=null;
		try {
			String sql="select * from register where email=? and password=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			us=new User();
			us.setId(rs.getInt(1));
			us.setFirstname(rs.getString(2));
			us.setLastname(rs.getString(3));
			us.setEmail(rs.getString(4));
			us.setPassword(rs.getString(5));
			us.setCpassword(rs.getString(6));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return us;
		
	}

}


