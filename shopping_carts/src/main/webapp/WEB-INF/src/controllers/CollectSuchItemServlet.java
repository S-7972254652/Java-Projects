package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.json.JSONArray;
import java.util.*;

import models.*;

/**
 * Servlet implementation class CollectCategoryServlet
 */
@WebServlet("/CollectCategoryServlet")
public class CollectSuchItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer categoryId = Integer.parseInt(request.getParameter("cat_id"));
        ArrayList<Item> items = Item.collectSuchItems(categoryId);

        JSONArray ja = new JSONArray();
        int i=0;
        
        if(items.size()!=0){
            Iterator<Item> it = items.iterator();
            while(it.hasNext()){
                Item item = it.next();
                System.out.println(item.getItemId()+" "+item.getItemName()+" "+item.getDescription()+" "+item.getPrice());

                String image = item.getImagePath();
                String set=null;
                    if(image!=null){
                        String rep = image.replace("\\","/");
                        set = rep.substring(36,rep.length());
                    }
                

                JSONObject jo = new JSONObject();
                jo.put("id",item.getItemId());
                jo.put("item_name",item.getItemName());
                jo.put("description",item.getDescription());
                jo.put("price",item.getPrice());   
                jo.put("image",set);             

                ja.put(i++,jo);
            }            
        }
        response.getWriter().write(ja.toString());
        System.out.println(items);
	}

}
