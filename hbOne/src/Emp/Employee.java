package Emp;

import com.hbOne.Map.Answer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity

public class Employee {
	@Id

	@Column(name="Employee-id")
	private int eid;
	private String Empname;
	@OneToOne
	private Salary sal;
	public Employee(int eid, String empname, Salary sal) {
		super();
		this.eid = eid;
		Empname = empname;
		this.sal = sal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public Salary getSal() {
		return sal;
	}
	public void setSal(Salary sal) {
		this.sal = sal;
	}
	
}
