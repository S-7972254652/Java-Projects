package com.hbOne;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetchdemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ss=factory.openSession();
		Student s=(Student)ss.get(Student.class,27);
		System.out.println(s);
		ss.close();
		factory.close();

	}

}