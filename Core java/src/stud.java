import java.util.Scanner;

class Student{
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println("id"+id);
		System.out.println("name"+name);
	}
}
class marks extends Student{
	String sub;
	int m;
	void insert1(String s,int m1) {
		sub=s;
		m=m1;
	}
	void display1() {
		System.out.println("Subject="+sub);
		System.out.println("marks="+m);
	}
	
}
class sport extends marks{
	String sportsname;
	int score;
	void insert2(String sn,int sc3) {
		sportsname=sn;
		score=sc3;
	}
	void display2() {
		System.out.println("sportsname"+sportsname);
		System.out.println("Score"+score);
	}
}
public class stud {

	public static void main(String[] args) {
		int i,m1,sc3;
		String a,n,s,sn;
		sport z=new sport();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		
		i=sc.nextInt();
		m1=sc.nextInt();
		sc3=sc.nextInt();
		a=sc.next();
		n=sc.next();
		s=sc.next();
		sn=sc.next();
		
		
		z.insert(i, sn);
		z.display();
		z.insert1(s, m1);
		z.display1();
		z.insert2(sn, sc3);
		z.display2();
	}

}
