import java.util.Scanner;

class Boy{
	int rollno;
	String name;
	void insert(int roll,String n ) {
		rollno=roll;
		name=n;
	}
	void display() {
		System.out.println("Enter the no"+rollno);
		System.out.println("Enter the name"+name);
	}
}
class Mark extends Boy{
	int point;
	void insert(int p) {
		point=p;
	}
	void display() {
		System.out.println("marks is:"+point);
	}
}
public class inherit {

	public static void main(String[] args) {
int roll,p;
String n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the r,n,p");
roll=sc.nextInt();
p=sc.nextInt();
n=sc.next();
Mark m=new Mark();
m.insert(p);
m.display();
m.insert(roll, n);
m.display();
	}

}
