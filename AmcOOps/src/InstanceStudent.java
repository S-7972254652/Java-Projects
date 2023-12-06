class Student{
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
public class InstanceStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
s1.insert(55, "Sagar");
s1.display();
	}

}
