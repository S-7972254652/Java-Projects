package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.ProductDtls;

public class ProductDAOImpl  implements ProductDAO {


	private Connection conn;
	
	public ProductDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}


	public boolean addProduct(ProductDtls p) {
        boolean f = false;
        try {
            String sql = "INSERT INTO product_details (name, description,Price, quantity,Photo) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, p.getname());
            ps.setString(2, p.getDescription());
            ps.setString(3, p.getPrice());
            ps.setString(4, p.getQuantity());
            ps.setString(5, p.getPhoto());
           

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                f = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }


	@Override
	public boolean addProducts(ProductDtls p) {
		// TODO Auto-generated method stub
		return false;
	}

}
