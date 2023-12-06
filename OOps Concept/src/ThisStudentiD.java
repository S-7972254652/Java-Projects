class Student14{
	int id;
	String name;
	String city;
	Student14(int id,String name){
		this.id=id;
		this.name=name;
	}
	Student14(int id,String name,String city){
		this(id,name);
		this.city=city;
	}
	void display() {
		System.out.println(id+" "+name+" "+city);
	}
}
public class ThisStudentiD {

	public static void main(String[] args) {
	Student14 e1=new Student14(111,"Karan");
	Student14 e2=new Student14(222,"skdk");
	e1.display();
	e2.display();
	}

}
