import java.util.Scanner;

class Student56
{
	int rollno,standard;
	String name,division;
	void insert(int r,int std,String n,String d) {
		rollno=r;
		standard=std;
		name=n;
		division=d;
	}
	void display() {
		System.out.println("Roll no"+rollno);
		System.out.println("Standar is:"+standard);
		System.out.println("Name:"+name);
		System.out.println("Division"+division);
	}
}
class Marks extends Student56{
	int mr;
	void insert1(int j) {
		mr=j;
	}
	void display1() {
		System.out.println("marks"+mr);
	}
}
public class Studen11Inheritance {

	public static void main(String[] args) {
		int r,std;
		int j;
		String n,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll no,Standard,name and division");
		r=sc.nextInt();
		std=sc.nextInt();
		n=sc.next();
		d=sc.next();
		j=sc.nextInt();
		Marks ma=new Marks();
		ma.insert(r, std, n, d);
		ma.display();
		ma.insert1(j);
		ma.display1();

	}

}