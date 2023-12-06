package testJdbc8;

public class Employee {

	private int id;  
	private String name;  
	private float salary;  
	//no-arg and parameterized constructors  
	//getters and setters 
	public Employee(int i, String string, int j) {	
		id=i;
		name=string;
		salary=j;
	}
	
	
	


	public String toString(){  
	    return id+" "+name+" "+salary;  
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getSalary() {
		return salary;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	 

}
