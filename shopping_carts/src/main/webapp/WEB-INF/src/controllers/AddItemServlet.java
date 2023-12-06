package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.*;

/**
 * Servlet implementation class CollectCategoryServlet
 */
public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer catId = Integer.parseInt(request.getParameter("cat"));
		String itemName = request.getParameter("item_name");
		String description = request.getParameter("item_desc");
        Integer price = Integer.parseInt(request.getParameter("item_price"));
        
        Item item = new Item(new Category(catId),itemName,description,price);
        Boolean flag = item.addItem();
		
		request.setAttribute("message",itemName+" as a new item added");
		request.getRequestDispatcher("success.jsp").forward(request, response);
		
	}

}
