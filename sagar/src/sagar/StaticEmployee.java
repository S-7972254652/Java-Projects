package sagar;
class Employee{
	int id;
	String name;
	static String CompanyName="Winjit";
	Employee(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Company Name ="+CompanyName);
	}
}
public class StaticEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(55,"Sagar");
		Employee e1=new Employee(55,"Mahesh");
		e1.display();
		e.display();
	}

}
