package sagar;
class Student8765{
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
public class instaanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student8765 s1=new Student8765();
		Student8765 s2=new Student8765();
		s1.insert(222000, "Sagar");
		s2.insert(44,"Ajay");
		s1.display();
		s2.display();
	}

}
