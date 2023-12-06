import java.util.Scanner;

class student17{
	int id,rollno;
	String name,division;
	void insert(int i,int r,String n,String d) {
		id=i;
		rollno=r;
		name=n;
		division=d;
	}
	void display() {
		System.out.println("ID="+id);
		System.out.println("Rollno="+rollno);
		System.out.println("Name="+name);
		System.out.println("Division="+division);
	}
}
class abc extends student17{
	int mr;
	void insert1(int x) {
	mr=x;	
	}
	void display1() {
		System.out.println("marks="+mr);
	}
}
public class inheritanceStudent {

	public static void main(String[] args) {
	int i,r;
	int x;
	String n,d;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Student id,roll no,name,division and marks:");
	i=sc.nextInt();
	r=sc.nextInt();
	n=sc.next();
	d=sc.next();
	x=sc.nextInt();
	abc m=new abc();
	m.insert(i, r, n, d);
	m.display();
	m.insert1(x);
	m.display1();

	}

}
