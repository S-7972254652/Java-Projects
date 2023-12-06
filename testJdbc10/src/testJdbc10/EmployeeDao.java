package testJdbc10;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class EmployeeDao {  
SimpleJdbcCall template;  
  
public <SimpleJdbcTemplate> EmployeeDao(SimpleJdbcCall template) {  
        this.template = template;  
}  
public int update (Employee e){  
String query="update employee set name=? where id=?";  
return template.update(query,e.getName(),e.getId());  
  
//String query="update employee set name=?,salary=? where id=?";  
//return template.update(query,e.getName(),e.getSalary(),e.getId());  
}  
  

}
