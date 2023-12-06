class Student9985{
	int id;
	String name;
	static String College="Gescoe";
	Student9985(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println("Your id is="+id);
		System.out.println("Your name is="+name);
		System.out.println("Your College name is="+College);

	}
}
public class StaticStudentCollegeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student9985 s=new Student9985(55,"Sagar");
Student9985 s1=new Student9985(58,"Akash");
s.display();
s1.display();
	}

}
