package testjdbc1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {  
	    ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	          
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
	    dao.saveEmployeeByPreparedStatement(new Employee(108,"Amit",35000));  
	}  
}
