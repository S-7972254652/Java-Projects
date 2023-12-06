import java.util.Scanner;

class Student503{
	int rollno,Class;
	String name,division;
	void insert(int r,int C,String n,String d) {
		rollno=r;
		Class=C;
	     name=n;
	     division=d;
	}
	void display() {
		System.out.println(rollno+" "+Class+" "+name+" "+division);
	}
}
class Marks extends Student503{
	int mr;
	void insert1(int m) {
		mr=m;
	}
	void display1() {
		System.out.println(mr);
	}
}
public class testinheritance {

	public static void main(String[] args) {
		int r,C;
		String n,d;
		Marks ma=new Marks();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Values");
		r=sc.nextInt();
		C=sc.nextInt();
		n=sc.next();
		d=sc.next();
		ma.insert(r, C, n, d);
		ma.display();
		ma.insert1(C);
		ma.display1();
	}

}
