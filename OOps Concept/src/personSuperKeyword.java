
class Person{
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Emp555 extends Person{
	float salary;
	Emp555(int id,String name,float salary){
		super(id,name);
		this.salary=salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}
public class personSuperKeyword {

	public static void main(String[] args) {
	Emp555 e1=new Emp555(1,"Ankit",4500);
	e1.display();

	}

}
