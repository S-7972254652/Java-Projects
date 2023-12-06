package com.admin.servlet;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.DAO.ProductDAOImpl;
import com.DB.DBConnect;
import com.entity.ProductDtls;

@WebServlet("/add_products")
@MultipartConfig
public class ProductsAdd extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String productName = req.getParameter("pname");
            String category = req.getParameter("category");
            String quantity = req.getParameter("quantity");
            String price = req.getParameter("price");
            String description = req.getParameter("description");
            String status = req.getParameter("status");
            Part part = req.getPart("pimg");
            String fileName = part.getSubmittedFileName();

            // Create a ProductDtls object with all the form data
            ProductDtls p = new ProductDtls(productName,category, quantity, price,  description, status, fileName, "admin");

            // Change the path to your desired location
            String uploadDirectory = "C:\\Users\\91797\\eclipse-workspace\\EcommerceFinalPr32\\src\\main\\webapp\\product";

            // Create the directory if it doesn't exist
            File uploadDir = new File(uploadDirectory);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            // Generate a unique filename to avoid overwriting existing files
            String uniqueFileName = System.currentTimeMillis() + "_" + fileName;

            // Write the uploaded file to the new location
            String filePath = uploadDirectory + File.separator + uniqueFileName;
            part.write(filePath);

            // Update the ProductDtls object with the unique filename
            p.setPhotoName(uniqueFileName);

            // Use your ProductDAOImpl to add the product to the database
            ProductDAOImpl dao = new ProductDAOImpl(DBConnect.getConn());
            boolean success = dao.addProducts(p);

            if (success) {
                HttpSession session = req.getSession();
                session.setAttribute("succMsg", "Product Added Successfully");
                resp.sendRedirect("admin/add_product.jsp");
            } else {
                HttpSession session = req.getSession();
                session.setAttribute("failedMsg", "Failed to add the product to the database");
                resp.sendRedirect("admin/add_product.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
            // Handle other exceptions or errors
            HttpSession session = req.getSession();
            session.setAttribute("failedMsg", "An error occurred: " + e.getMessage());
            resp.sendRedirect("admin/add_product.jsp");
        }
    }
}
