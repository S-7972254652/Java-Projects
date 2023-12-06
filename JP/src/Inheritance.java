import java.util.Scanner;

class Student {
	int id;
	String name, division;

	void insert(int i, String n, String d) {
		id = i;
		name = n;
		division = d;

	}

	void display() {
		System.out.println("Your Id=" + id + "" + "Your Name" + name + " " + "Your Div=" + division);
	}

}

class Marks extends Student {
	int mr;

	void insert1(int m) {
		mr = m;
	}

	void display1() {
		System.out.println(mr);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, m;
		String n, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id marks name and division");
		i = sc.nextInt();
		m = sc.nextInt();
		n = sc.next();
		d = sc.next();
		Marks m1 = new Marks();
		m1.insert(i, n, d);
		m1.display();
		m1.insert1(m);
		m1.display1();
	}
}
