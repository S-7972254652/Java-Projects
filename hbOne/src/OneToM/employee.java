package OneToM;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class employee {
@Id
@Column(name = "Employee-id")
private int empid;
private String empname;
@OneToMany(mappedBy = "employee")
private List<Salary>sal;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public List<Salary> getSal() {
	return sal;
}
public void setSal(List<Salary> sal) {
	this.sal = sal;
}
public employee(int empid, String empname, List<Salary> sal) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.sal = sal;
}
public employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
