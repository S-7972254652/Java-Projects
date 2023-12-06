class Employee{
	int id,salary;
	String name;
	Employee(int i,int s,String n){
		id=i;
		salary=s;
		name=n;
	}
	void display() {
		System.out.println(id+" "+salary+" "+name);
	}
}
public class SalaryConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee(50,16000,"sagar");
		e.display();
	}

}
