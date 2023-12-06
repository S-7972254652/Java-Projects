import java.util.Scanner;

class Man{
	int Salary;
	int id;
	String name;
	void insert(int s,int i,String n) {
		Salary=s;
		id=i;
		name=n;
	}
	void display() {
		System.out.println("Enter the Salary"+"Salary");
		System.out.println("Enter the id"+"id");
		System.out.println("Enter the name"+"name");
	}
}
class B extends Man{
	int bonus;
	void insert1(int b) {
		bonus=b;
	}
	void display1() {
		System.out.println("Enter the bonus"+"bonus");
	}
}
public class inh {

	public static void main(String[] args) {
		int S,i,b;
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary,id,bonus and name");
		S=sc.nextInt();
		i=sc.nextInt();
		b=sc.nextInt();
		n=sc.next();
		B b1=new B();
		b1.insert1(b);
		b1.display1();
		b1.insert(S,i,n);
		b1.display();

	}

}
