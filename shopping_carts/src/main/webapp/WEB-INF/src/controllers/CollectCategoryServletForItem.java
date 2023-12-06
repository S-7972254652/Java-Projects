package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Category;

/**
 * Servlet implementation class CollectCategoryServlet
 */
@WebServlet("/CollectCategoryServlet")
public class CollectCategoryServletForItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Category> categories = Category.collectAllCategories();
		request.setAttribute("all_categories",categories);
		request.getRequestDispatcher("add_items.jsp").forward(request, response);		
	}

}
