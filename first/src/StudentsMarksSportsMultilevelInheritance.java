import java.util.Scanner;

class Stud{
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
class points extends Stud{
	String subject;
	int total;
	void insert1(String s,int to) {
		subject=s;
		total=to;
	}
	void display1() {
		System.out.println(subject+" "+total);
	}
}
class Sports extends points{
	int score;
	void insert2(int sco) {
		score=sco;
	}
	void display2() {
		System.out.println("Score"+score);
	}
}

public class StudentsMarksSportsMultilevelInheritance {

	public static void main(String[] args) {
		int i;
		int to;
		int sco;
		String n;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id,name,subject,marks,score and Sports name");		i=sc.nextInt();
		to=sc.nextInt();
		sco=sc.nextInt();
		n=sc.next();
		s=sc.next();
		Sports sp=new Sports();
		sp.insert(i, n);
		sp.display();
		sp.insert1(s, to);
		sp.display1();
		sp.insert2(sco);
		sp.display2();
	}

}
