package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Product;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
	    String name = req.getParameter("name");
	    String password = req.getParameter("password");
	    String email = req.getParameter("email");
	    String mobile = req.getParameter("mobile");
	    
	    Product p = new Product(name, password, email, mobile);
	    System.out.println("Product created");

	    // Send a response indicating success (you can customize this)
	    resp.getWriter().write("Registration successful");
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
