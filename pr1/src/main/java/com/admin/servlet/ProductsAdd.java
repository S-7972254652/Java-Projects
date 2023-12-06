package com.admin.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.DAO.ProductDAOImpl;
import com.DB.DBConnect;
import com.entity.ProductDtls;

@WebServlet("/add_products")
@MultipartConfig
public class ProductsAdd extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
	String productName=req.getParameter("pname");
	String category=req.getParameter("category");
	String quantity=req.getParameter("quantity");
	String price=req.getParameter("price");
	String description=req.getParameter("description");
	String status=req.getParameter("status");
	Part part=req.getPart("pimg");
	String fileName=part.getSubmittedFileName();
	
	ProductDtls p=new ProductDtls(productName,price,quantity,category,description,status,fileName,"admin");
	//p.setProductId(0);
	//System.out.println(p);
	
	
	
	
	ProductDAOImpl dao=new ProductDAOImpl(DBConnect.getConn());

String path=getServletContext().getRealPath("")+"product";
System.out.println(path);
//	File f=new File(path);
//	part.write(path+File.separator+fileName);
	
	
	
	
//	boolean f=dao.addProducts(p);
//	HttpSession session=req.getSession();
//	if(f)
//	{
//		
//		
//		
//		session.setAttribute("succMsg", "Product Add Successfully");
//		resp.sendRedirect("admin/add_product.jsp");
//	}else {
//		session.setAttribute("failedMsg", "Something Went Wrong");
//		resp.sendRedirect("admin/add_product.jsp");
//		
//	}
	
	
} catch (Exception e) {
	e.printStackTrace();
}
	}

}
