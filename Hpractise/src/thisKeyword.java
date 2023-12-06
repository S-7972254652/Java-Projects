class Student54{
	int rollno;
	String name;
	Student54(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	void display() {
		System.out.println(rollno+" "+name);
	}
	
}
public class thisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student54 s=new Student54(55,"Sagar");
s.display();
	}

}
