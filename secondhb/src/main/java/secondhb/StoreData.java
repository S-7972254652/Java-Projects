package secondhb;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
public class StoreData {  
  
    public static void main( String[] args )  
    {  
         StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
            Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
          
         Student e1=new Student();    
          e1.setRoll(1);
          e1.setName("Sagar Wani");
          e1.setStandard("15");
             
         
       session.save(e1);  
       t.commit();  
       System.out.println("successfully saved");    
        factory.close();  
        session.close();     
    }  
}  
