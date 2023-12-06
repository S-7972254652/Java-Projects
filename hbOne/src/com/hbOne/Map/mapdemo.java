package com.hbOne.Map;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapdemo {
	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory =cfg.buildSessionFactory();
	Question q1=new Question();
	q1.setQid(1213);
	q1.setQues("What is Java ?");
	Answer a=new Answer();
	a.setAid(3435);
	a.setAnsw("Java is a Programming Language");
	q1.setAns(a);
	Session sn=factory.openSession();
	Transaction tx=sn.beginTransaction();
	sn.save(a);
	sn.save(q1);
	tx.commit();
	factory.close();
	
	}
}