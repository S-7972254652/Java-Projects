package Emp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Salary {
	@Id
	@Column(name="Sal_id")
	private int sid;
	private String month;
	private String salary;
	public Salary(int sid, String month, String salary) {
		super();
		this.sid = sid;
		this.month = month;
		this.salary = salary;
	}
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
