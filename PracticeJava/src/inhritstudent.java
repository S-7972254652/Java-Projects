import java.util.Scanner;

class Stud{
	int rollno;
	String name;
	void insert(int r,String n) {
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println("Enter the roll no"+rollno);
		System.out.println("Enter the name"+name);
	}
}
class Marks555 extends Stud{
	int ma;
	void insert1(int q) {
		ma=q;
	}
	void display1() {
		
			System.out.println("Enter the marks="+ma);
		
	}
}
public class inhritstudent {

	public static void main(String[] args) {
int r;
String n;
int q;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the rollno,name and marks");
r=sc.nextInt();
n=sc.next();
q=sc.nextInt();
Marks555 mo=new Marks555();
mo.insert(r, n);
mo.display();
mo.insert1(q);
mo.display1();
	}

}
