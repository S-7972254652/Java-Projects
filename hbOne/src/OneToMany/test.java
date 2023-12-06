package OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Question q1=new Question();
		q1.setQid(132);
		q1.setQues("What is Java");
		Answer a=new Answer();
		a.setAid(134);
		a.setAnsw("Java Is A Programing Language");
		a.setQuestion(q1);
		Answer a1=new Answer();
		a1.setAid(136);
		a1.setAnsw("Java Is Object Oriented Programing Language");
		a1.setQuestion(q1);
		Answer a2=new Answer();
		a2.setAid(138);
		a2.setAnsw("Software Can Be Created By Using Java");
		a2.setQuestion(q1);
		List<Answer> l=new ArrayList<Answer>();
		l.add(a);
		l.add(a1);
		l.add(a2);
		
		Session sn=factory.openSession();
		Transaction tx=sn.beginTransaction();
		sn.save(q1);
		sn.save(a);
		sn.save(a1);
		sn.save(a2);
		
		tx.commit();
		factory.close();
	}

}
