import java.util.Scanner;

class Stu{
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println("Your id ="+id);
		System.out.println("Your name ="+name);
	}
}
class Marks1001 extends Stu{
	int mark;
	void inert1(int m) {
		mark=m;
	}
	void display1() {
		System.out.println("Your Marks = "+mark);
	}
}
class Sport extends Marks1001{
	int Score;
	String sportname;
	void insert2(int s,String sn) {
		Score=s;
		sportname=sn;
	}
	void display2() {
		System.out.println("Score is = "+Score);
		System.out.println("Sport Name is = "+sportname);
	}
}
public class mLevelInherStu {
	public static void main(String[] args) {
		int i,m,s;
		String n,sn;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id,mark,Score,name,sportname");
		i=sc.nextInt();
		m=sc.nextInt();
		s=sc.nextInt();
		n=sc.next();
		sn=sc.next();
		Sport p=new Sport();
		p.insert(i, sn);
		p.display();
		p.inert1(m);
		p.display1();
		p.insert2(s, sn);
		p.display2();
	}
}
