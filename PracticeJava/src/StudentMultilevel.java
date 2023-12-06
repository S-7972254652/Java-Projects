import java.util.Scanner;

class Stu{
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println("Your id= "+id);
		System.out.println("Your name= "+name);
	}
}
class mr extends Stu{
	int point;
	void insert1(int p) {
		point=p;
	}
	void display1() {
		System.out.println("Marks is= "+point);
	}
}
class sport extends mr{
	String sportsname;
	void insert2(String sn) {
		sportsname=sn;
	}
	void display2() {
		System.out.println("Enter the sports name"+sportsname);
	}
}
public class StudentMultilevel {

	public static void main(String[] args) {
	int i;
	String n;
	int p;
	String sn;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id,name,marks and sportname");
	i=sc.nextInt();
	n=sc.next();
	p=sc.nextInt();
	sn=sc.next();
	sport st=new sport();
	st.insert(i, sn);
	st.display();
	st.insert1(p);
	st.display1();
	st.insert2(sn);
	st.display2();
	}

}
