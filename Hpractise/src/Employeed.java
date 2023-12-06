import java.util.Scanner;

class Employee102{
	String name;
	int id;
	void insert(String n,int i) {
		name=n;
		id=i;
	}
	void display() {
		System.out.println("Your Name is = "+name);
		System.out.println("Your ID is = "+id);

	}
}
class Time extends Employee102{
	int Workinghour;
	void insert1(int wh) {
		Workinghour=wh;
	}
	void display1() {
		System.out.println("Working hour is = "+Workinghour);
	}
}
public class Employeed {

	public static void main(String[] args) {
		String n;
		int i,wh;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name , id and time");
		n=sc.next();
		i=sc.nextInt();
		wh=sc.nextInt();
		Time t=new Time();
		t.insert(n, i);
		t.display();
		t.insert1(wh);
		t.display1();
	}

}
