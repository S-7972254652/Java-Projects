package sagar;
class Student{
	int id;
	String name;
	static String Cname="its";
	Student(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println("Enter the id="+id);
		System.out.println("Enter the name="+name);
		System.out.println("Enter the Company name="+Cname);
	}
}
public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student s=new Student(55,"Sagar");
	Student s1=new Student(22,"As");
	s.display();
	s1.display();
	
	}

}
