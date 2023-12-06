import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
public class Test {
	 Resource r=new ClassPathResource("applicationContext.xml");  
     BeanFactory factory=new XmlBeanFactory(r);  
       
     Em e=(Em)factory.getBean("obj");  
     e.display();  
}
