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
public class ProductAdd extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            String description = req.getParameter("description");
            String price = req.getParameter("price");
            String quantity = req.getParameter("quantity");
            Part part = req.getPart("img");
            String fileName = part.getSubmittedFileName();

            // Create a ProductDtls object with all the form data
            ProductDtls p = new ProductDtls(name,description, price,quantity,fileName);

            // Change the path to your desired location
            String uploadDirectory = "C:\\Users\\91797\\eclipse-workspace\\Ashram_Final\\src\\main\\webapp\\images";

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
            p.setname(uniqueFileName);

            // Use your ProductDAOImpl to add the product to the database
            ProductDAOImpl dao = new ProductDAOImpl(DBConnect.getConn());
            boolean success = dao.addProduct(p);

            if (success) {
                HttpSession session = req.getSession();
                session.setAttribute("succMsg", "Product Added Successfully");
                resp.sendRedirect("admin/ADD_Product.jsp");
            } else {
                HttpSession session = req.getSession();
                session.setAttribute("failedMsg", "Failed to add the product to the database");
                resp.sendRedirect("admin/ADD_Product.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
            // Handle other exceptions or errors
            HttpSession session = req.getSession();
            session.setAttribute("failedMsg", "An error occurred: " + e.getMessage());
            resp.sendRedirect("admin/add_Product.jsp");
        }
    }
}
