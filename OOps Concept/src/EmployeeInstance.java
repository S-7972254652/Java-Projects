class Employee4
{
	int id;
	String name;
	void insertRecord(int i,String n)
	{
		id=i;
		name=n;
	}
	void displayInformation() {
		System.out.println(id+""+name);
	}
	
}
public class EmployeeInstance {

	public static void main(String[] args) {
		Employee4 e1=new Employee4();
		Employee4 e2=new Employee4();
		e1.insertRecord(111, "Raj");
		e2.insertRecord(222, "Akash");
		e1.displayInformation();
		e2.displayInformation();
	}

}
