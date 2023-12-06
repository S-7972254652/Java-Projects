package listeners;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContext;
import java.util.ArrayList;

import models.*;
import controllers.*;

public class Listener implements ServletContextListener{
	
	
	public void contextInitialized(ServletContextEvent e){
		ServletContext context = e.getServletContext();
		Admin.createTable();
		State.createTable();
		City.createTable();
		Category.createTable();
		Item.createTable();
		Cart.createTable();
		PendingDelivery.createTable();
		Order.createTable();
		Block.createTable();
		Item.updateTable();

		

		User.createTable();
		User.updateTable();

		
				
		
		ArrayList<State> state = State.collectStates();
		ArrayList<City> city = City.collectCities();
		ArrayList<Item> items = Item.collectAllItem();
		ArrayList<Category> categories= Category.collectAllCategories();
		
		context.setAttribute("state",state);
		context.setAttribute("city",city);
		context.setAttribute("items",items);
		context.setAttribute("categories",categories);

		}

	public void contextDestroyed(ServletContextEvent e){
		System.out.println("Listener /server closed");
	}
}