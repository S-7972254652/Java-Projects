package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mappingdemo {

	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Emp e1=new Emp();
	Emp e2=new Emp();
	e1.setEid(34);
	e1.setEname("Radha");
	e2.setEid(35);
	e2.setEname("Shyam");
	Project p1=new Project();
	Project p2=new Project();
	p1.setPid(10);
	p1.setPname("Library Management System");
	p2.setPid(11);
	p2.setPname("Chatbot");
	List<Emp> list=new ArrayList<Emp>();
	List<Project> list1=new ArrayList<Project>();
	list.add(e1);
	list.add(e2);
	list1.add(p1);
	list1.add(p2);
	e1.setP(list1);
	p2.setE(list);
	Session ss=factory.openSession();
	Transaction tx=ss.beginTransaction();
	ss.save(e1);
	ss.save(e2);
	ss.save(p1);
	ss.save(p2);
	tx.commit();
	factory.close();
	

	}

}
