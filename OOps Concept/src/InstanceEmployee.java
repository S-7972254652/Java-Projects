class Employee555{
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class InstanceEmployee {

	public static void main(String[] args) {
	Employee555 e1=new Employee555();
	Employee555 e2=new Employee555();
	e1.insert(111,"Aaksh");
	e2.insert(5550,"nikhil");
	e1.display();
	e2.display();

	}

}
