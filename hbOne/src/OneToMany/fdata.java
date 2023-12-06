package OneToMany;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class fdata {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session sn=factory.openSession();
		  
		Transaction tx=sn.beginTransaction();
		Question q=sn.get(Question.class, 132);
		System.out.println(q.getQid());
		System.out.println(q.getQues());
		System.out.println(q.getAns().size());
		for(Answer a:q.getAns())
		{
			System.out.println(a.getAnsw());
		}
		tx.commit();
		factory.close();

	}

}
