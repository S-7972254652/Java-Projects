class Student{
	int id;
	String name;
	static String Cname="its";
	Student(int i,String n){
		id=i;
		name=n;
	}
	void display(){
		System.out.println(id+""+name);
		System.out.println(Cname);
	}
}
public class StaticStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student(55,"Sagar");
s.display();
	}

}
