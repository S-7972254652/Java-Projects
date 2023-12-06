package com.hbTwo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Product p=new Product();
		p.setProductId(50);
		p.setProductName("Laptop");
		p.setProductPrice(500);
		System.out.println(p);
		Session sn=factory.openSession();
		Transaction tx=sn.beginTransaction();
		sn.save(p);
		tx.commit();
		sn.close();
	}

}
