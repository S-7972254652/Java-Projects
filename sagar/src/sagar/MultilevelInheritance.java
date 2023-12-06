package sagar;

import java.util.Scanner;

class Student{
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
class marks extends Student{
	int mark;
	String subject;
	void insert1(int m,String sub) {
		mark=m;
		subject=sub;
	}
	void display1() {
		System.out.println("marks"+marks);
		System.out.println("Subject"+subject);
	}
}
class sports extends marks{
	String sportsname;
	int score;
	void insert2(String sn,int se) {
		sportsname=sn;
		score=se;
	}
	void display2() {
		System.out.println("Sports Name"+sportsname);
		System.out.println("Score:"+score);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String n;
		int m;
		String sub;
		String sn;
		int se;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id,name,subject,sportsname and score");
		i=sc.nextInt();
		n=sc.next();
		m=sc.nextInt();
		sub=sc.next();
		sn=sc.next();
		se=sc.nextInt();
		sports sp=new sports();
		sp.insert(i,n);
		sp.display();
		sp.insert1(m, sub);
		sp.display1();
		sp.insert2(sn, se);
		sp.display2();
	}

}
