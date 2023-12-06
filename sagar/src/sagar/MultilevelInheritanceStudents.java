package sagar;

import java.util.Scanner;

class Student9985{
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
class Division85 extends Student9985
{
	String div;
	int SeatNo;
	void insert1(String d,int sn) {
		div=d;
		SeatNo=sn;
	}
	void display1() {
		System.out.println(div+" "+SeatNo);
	}
}
class Sports8897 extends Division85{
	String sportsname;
	int score;
	void insert2(String sp,int so) {
		sportsname=sp;
		score=so;
	}
	void display2() {
		System.out.println(sportsname+" "+score);
	}
}
public class MultilevelInheritanceStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sn,so;
		String n,d,sp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id,Seat No,Score,name,division ans Sports name");
		i=sc.nextInt();
		sn=sc.nextInt();
		so=sc.nextInt();
		n=sc.next();
		d=sc.next();
		sp=sc.next();
		Sports8897 p=new Sports8897();
		p.insert(i, n);
		p.display();
		p.insert1(d, sn);
		p.display1();
		p.insert2(sp, so);
		p.display2();
	}

}
