package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import models.Category;
import java.util.*;

/**
 * Servlet implementation class AddCategoryServlet
 */
@WebServlet("/AddCategoryServlet")
public class AddCategoryServletAJ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String category = request.getParameter("category");        
		Category.save(category);
        ArrayList<Category> categoryArr = Category.collectAllCategories();
        JSONArray arr = new JSONArray();

        int i=0;
        Iterator<Category> it = categoryArr.iterator();

        while(it.hasNext()){
            Category cat = it.next();
            JSONObject jo =  new JSONObject();

            jo.put("id",cat.getCategoryId());
            jo.put("cat",cat.getName());   
            arr.put(i++,jo);
        }
        System.out.println(arr);
        response.getWriter().write(arr.toString());
	}

}
