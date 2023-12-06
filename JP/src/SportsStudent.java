import java.util.Scanner;

class student76{
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println("Your ID"+id);
		System.out.println("Your name"+name);
	}
}
class points extends student76{
	int points;
	void insert1(int p) {
		points=p;
	}
	void display1() {
		System.out.println("Your points"+points);
	}
}
class sports extends points{
	String game;
	void insert2(String g) {
		game=g;
	}
	void display2() {
		System.out.println("Your game name"+game);
	}
}
public class SportsStudent {

	public static void main(String[] args) {
int i,p;
String n,g;
Scanner sc=new Scanner(System.in);
System.out.println("Enter ID,Name,Points,Game");
i=sc.nextInt();
p=sc.nextInt();
n=sc.next();
g=sc.next();
sports s=new sports();
s.insert(i, n);
s.display();
s.insert1(p);
s.display1();
s.insert2(g);
s.display2();
	}

}
