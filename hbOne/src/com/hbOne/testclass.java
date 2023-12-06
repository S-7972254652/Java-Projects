package com.hbOne;

import java.security.cert.Certificate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class testclass {

	public static void main(String[] args) {
		System.out.println("Hello");

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Student s = new Student();
		s.setId(3484);
		s.setName("Sagar");
		s.setCity("Nasik");
		certificate c = new certificate();
		c.setCourse("Java");
		c.setDuration("1 Year");
		s.setCerti(c);
		System.out.println(s);
		Session sn = factory.openSession();
		Transaction tx = sn.beginTransaction();

		/*
		 * Example of HQL to get all the records Query
		 * query=sn.createQuery("from Student");//here persistent class name is Emp List
		 * list=query.list();
		 */

		/*
		 * Example of HQL to get records with pagination Query
		 * query=sn.createQuery("from Student"); query.setFirstResult(1);
		 * query.setMaxResults(34); List list=query.list();
		 */

		/*
		 * Example of HQL update query Query
		 * q=sn.createQuery("update Student set name=:n where id=:i");
		 * q.setParameter("n","Uditya Narayan"); q.setParameter("i",1); int
		 * status=q.executeUpdate(); System.out.println(status);
		 */

		/*
		 * Query query=sn.createQuery("delete from Student where id=1"); //specifying
		 * class name (Emp) not tablename query.executeUpdate();
		 */
		
//		Query q=sn.createQuery("select max(id) from Student"); 
		
		

		sn.save(s);
		tx.commit();
		sn.close();
	}

}
