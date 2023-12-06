class teacher{
	int rollno;
	String name;
	void insert(int r,String n) {
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name);
	}
}
public class InstanceMethodStudentRollNameCall {

	public static void main(String[] args) {
	teacher s1=new teacher();
	teacher s2=new teacher();
	s1.insert(111,"Sagar");
	s2.insert(122,"Ajay");
	s1.display();
	s2.display();

	}

}
