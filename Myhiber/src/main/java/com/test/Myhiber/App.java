package com.test.Myhiber;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
    	Configuration configuration=new Configuration();
    	buildSessionFactory = configuration.configure().buildSessionFactory();
    	
    }
}
