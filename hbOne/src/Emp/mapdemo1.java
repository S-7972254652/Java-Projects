package Emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbOne.Map.Answer;
import com.hbOne.Map.Question;

public class mapdemo1 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Employee e = new Employee();
		e.setEid(1214);
		e.setEmpname("Sagar");
		Salary s = new Salary();
		s.setSid(101);
		s.setMonth("january");
		s.setSalary("10000");
		e.setSal(s);
		Session sn = factory.openSession();
		Transaction tx = sn.beginTransaction();
		sn.save(s);
		sn.save(e);
		tx.commit();
		factory.close();

	}

}
