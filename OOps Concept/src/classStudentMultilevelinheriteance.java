import java.util.Scanner;

class students{
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println("id="+id);
		System.out.println("name="+name);
	}
}
class m_stud extends students{
	String subject;
	int marks;
	void insert1(String s,int m) {
		subject=s;
		marks=m;
	}
	void display1() {
		System.out.println("Subject="+subject);
		System.out.println("Marks="+marks);
	}
}
class sports extends m_stud{
	int score;
	String sportsname;
	void insert2(int sc1,String sn) {
		score=sc1;
		sportsname=sn;
	}
	void display2() {
		System.out.println("Score"+score);
		System.out.println("sportsname"+sportsname);
	}
}
public class classStudentMultilevelinheriteance {

	public static void main(String[] args) {
	int i,m,sc1;
	String n,s,sn;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id,name,subject,marks,score and Sports name");
	i=sc.nextInt();
	n=sc.next();
	s=sc.next();
	m=sc.nextInt();
	sc1=sc.nextInt();
	sn=sc.next();
	sports sp=new sports();
	sp.insert(i, n);
	sp.display();
	sp.insert1(s, m);
	sp.display1();
	sp.insert2(sc1, sn);
	sp.display2();
	}

}
