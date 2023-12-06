package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; // Make sure to import the correct Configuration class

import com.entities.Note;
import com.helper.FactoryProvider;

@WebServlet("/SaveNoteServlet")
public class SaveNoteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SaveNoteServlet() {
        super();
    }

    /**
     *
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String title = request.getParameter("title");
            String content = request.getParameter("content");

            Note note = new Note(title, content, new Date());
//
//            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//            SessionFactory factory = cfg.buildSessionFactory();

//            Session session = factory.openSession();
            Session s=FactoryProvider.getFactory().openSession();
            Transaction tx = s.beginTransaction();
            s.save(note);
            tx.commit();
            s.close();
//            factory.close();
          response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Notes Added Successfully</h1>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
