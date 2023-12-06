import java.util.Scanner;

class Student501{
	int rollno;
	int Class;
	void insert(int r,int c) {
		rollno=r;
		Class=c;
	}
	void display() {
		System.out.println(" roll no"+rollno);
		System.out.println("class ="+Class);
	}
}
class Marks extends Student501{
	int mark;
	void insert(int m) {
		mark=m;
	}
	void display1() {
		System.out.println(" marks ="+mark);
	}
}
public class studentinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,m;
		Marks m1=new Marks();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rollno, class and marks");
		r=sc.nextInt();
		c=sc.nextInt();
		m=sc.nextInt();
		m1.insert(m);
		m1.insert(r, c);
		m1.display();
		m1.display1();
	}

}
