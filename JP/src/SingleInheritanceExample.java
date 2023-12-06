import java.util.Scanner;

class student{
	int roll;
	String name,division;
	void insert(int r,String n,String d) {
		roll=r;
		name=n;
		division=d;
	}
	void display() {
		System.out.println(roll+" "+name+" "+division);
	}
}
class Marks extends student{
	int points;
	void insert1(int p) {
		points=p;
	}
	void display1() {
		System.out.println(points);
	}
}
public class SingleInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,p;
		String n,d;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll,name,div");
		r=sc.nextInt();
		p=sc.nextInt();
		n=sc.next();
		d=sc.next();
		Marks m=new Marks();
		m.insert(r, n, d);
		m.display();
		m.insert1(p);
		m.display1();
	}

}
