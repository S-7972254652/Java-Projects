package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.CartDAOImpl;
import com.DAO.ProductDAOImpl;
import com.DB.DBConnect;
import com.entity.Cart;
import com.entity.ProductDtls;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int pid=Integer.parseInt(req.getParameter("pid"));
			int uid=Integer.parseInt(req.getParameter("uid"));
			
			ProductDAOImpl dao=new ProductDAOImpl(DBConnect.getConn());
			ProductDtls p=dao.getProductById(pid);	
			
			Cart c=new Cart();
			
			c.setPid(pid);
			c.setUserId(uid);
			c.setProductName(p.getProductname());
			c.setPrice(Double.parseDouble(p.getPrice()));
			c.setTotalPrice(Double.parseDouble(p.getPrice()));
			
			CartDAOImpl dao2=new CartDAOImpl(DBConnect.getConn());
			boolean f=dao2.addCart(c);
			
			
			HttpSession session=req.getSession();
			
			if(f)
			{
				session.setAttribute("addCart", "Book Added to Cart");
				resp.sendRedirect("index.jsp");
				
				//System.out.println("Add Cart Success");
			}
			else {
				session.setAttribute("failed", "Book Not Added to Cart");
				resp.sendRedirect("index.jsp");
				
				//System.out.println("not added to cart");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
