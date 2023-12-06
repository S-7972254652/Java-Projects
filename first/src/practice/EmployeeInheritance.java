package practice;

class mouse{
	void barked() {
		System.out.println("Barking..");
	}
}
class Cat extends mouse{
	void lunch() {
		System.out.println("Meow..");
	}
}
public class EmployeeInheritance {

	public static void main(String[] args) {
		mouse d=new mouse();
	
		d.barked();
		d.lunch();

	}

}
