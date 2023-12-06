package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.ProductDAOImpl;
import com.DB.DBConnect;
import com.entity.ProductDtls;

@WebServlet("/editproducts")
public class EditProductsServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int id=Integer.parseInt(req.getParameter("id"));
			String productName = req.getParameter("pname");
            String category = req.getParameter("category");
            String quantity = req.getParameter("quantity");
            String price = req.getParameter("price");
            String description = req.getParameter("description");
            String status = req.getParameter("status");
			
			ProductDtls p=new ProductDtls();
			p.setProductId(id);
			p.setProductname(productName);
			p.setProductCategory(category);
			p.setQuantity(quantity);
			p.setPrice(price);
			p.setDescription(description);
			p.setStatus(status);
			
			ProductDAOImpl dao=new ProductDAOImpl(DBConnect.getConn());
			boolean f=dao.updateEditProducts(p);
			
			HttpSession session=req.getSession();
			
			if(f) {
				session.setAttribute("succMsg", "Product Updated Successfully..");
				resp.sendRedirect("admin/all_products.jsp");
			}else {
				session.setAttribute("failedMsg", "Product not Updated Successfully..");
				resp.sendRedirect("admin/all_products.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
