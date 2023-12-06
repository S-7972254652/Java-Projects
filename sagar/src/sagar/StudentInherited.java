package sagar;

import java.util.Scanner;

class boy{
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println(" Your Name:"+name);
		System.out.println("Your id:"+id);
	}
}
class mr extends boy{
	int points;
	void insert1(int p) {
		points=p;
	}
	void display1() {
		System.out.println("Marks You Got"+points);
	}
}
public class StudentInherited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,p;
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id,points and name");
		mr s=new mr();
		i=sc.nextInt();
		p=sc.nextInt();
		n=sc.next();
		s.insert(i, n);
		s.display();
		s.insert1(p);
		s.display1();

	}

}
