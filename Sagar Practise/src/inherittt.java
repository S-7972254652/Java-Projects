import java.util.Scanner;

class student{
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println("Enter your id="+id);
		System.out.println("Enter your name="+name);
	}
}
class Marks extends student{
	double mr;
	void insert1(double m) {
		mr=m;
	}
	void display1() {
		System.out.println("Marks Obtained="+mr);
	}
}
public class inherittt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks m=new Marks();
		int i;
		String n; 
		double mr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id,name & marks");
		i=sc.nextInt();
		n=sc.next();
		mr=sc.nextDouble();
		m.insert(i, n);
		m.display();
		m.insert1(mr);
		m.display1();
		
	}

}
