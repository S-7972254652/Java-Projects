import java.util.Scanner;

java.util.Scanner

class Student{
	int rollno;
	String division;
	void insert(int r,String d) {
	rollno=r;
	division=d;
	}
	void display() {
		System.out.println("Enter the roll no"+rollno);
		System.out.println("Enter the division"+division);
	}
}
class Markss extends Student{
	int mark;
	void insert1(int m) {
		mark=m;
	}
	void display1() {
		System.out.println("Enter the Marks"+mark);
	}
}
public class StudentsInheritMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,m;
		String d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entert the value");
		r=sc.nextInt();
		m=sc.nextInt();
		d=sc.next();
		Markss n=new Markss();
		n.insert(r, d);
		n.display();
		n.insert1(m);
		n.display1();
		
		
		
	}

}
