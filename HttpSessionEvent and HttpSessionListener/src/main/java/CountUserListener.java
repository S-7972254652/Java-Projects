

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSessionEvent;


public class CountUserListener extends HttpServlet {
	private static final long serialVersionUID = 1L;
ServletContext ctx=null;
static int total=0,current=0;

public void sessionCreated(HttpSessionEvent e){
	total++;
	current++;
	
	ctx=e.getSession().getServletContext();
	ctx.setAttribute("totaluser", total);
	ctx.setAttribute("currentusers", current);
}
public void sessionDestroyed(HttpSessionEvent e) {
	current--;
	ctx.setAttribute("currentusers", current);
}
}
