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
	int point;
	void insert1(int p) {
		point=p;
	}
	void display1() {
		System.out.println(point);
	}
}
class Sports extends marks{
	String sportname;
	int score;
	void insert2(String sn,int sc1) {
		sportname=sn;
		score=sc1;
	}
	void display2() {
		System.out.println(sportname+" "+score);
	}
}
public class multilevelInheritStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, p ,sc1;
		String n,sn;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id,points,score,name and sports name");
		i=sc.nextInt();
		p=sc.nextInt();
		sc1=sc.nextInt();
		n=sc.next();
		sn=sc.next();
		Sports b=new Sports();
		b.insert(i, sn);
		b.display();
		b.insert1(p);
		b.display1();
		b.insert2(sn, sc1);
		b.display2();
	}

}
