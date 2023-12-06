import java.util.Scanner;

class st{
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println("Your ID is = "+id);
		System.out.println("Your Name is = "+name);
	}
}
class r extends st{
	int Roll;
	void insert1(int ro) {
		Roll=ro;
	}
	void display1() {
		System.out.println("Your Roll No is = "+Roll);
	}

}
public class SM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		r r1=new r();
		int i,ro;
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID, Roll No & Name");
		i=sc.nextInt();
		ro=sc.nextInt();
		n=sc.next();
		r1.insert(i, n);
		r1.display();
		r1.insert1(ro);
		r1.display1();
	}

}
