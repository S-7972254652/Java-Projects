import java.util.Scanner;

class Student{
int id;
String name;
void insert(int i,String n) {
	id=i;
	name=n;
}
void display() {
	System.out.println("Your id is="+id+" "+"Your Name is ="+name);
}
}
class Markks extends Student{
	int marksss;
	void insert1(int ms) {
		marksss=ms;
	}
	void display1() {
		System.out.println("Your marks is="+marksss);
	}
}
class Sports extends Markks{
	String sportsname;
	int score;
	void insert2(String sn,int so) {
		sportsname=sn;
		score=so;
	}
	void display2() {
		System.out.println("Your sports is="+marksss+" "+"Your score is="+score);	
	}
}
public class multilevelidnameMarksSportsnamescore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n,sn;
		int i,ms,so;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name,sports name,id,marks,score");
		n=sc.next();
		sn=sc.next();
		i=sc.nextInt();
		ms=sc.nextInt();
		so=sc.nextInt();
		Sports p=new Sports();
		p.insert(i, sn);
		p.display();
		p.insert1(ms);
		p.display1();
		p.insert2(sn, so);
		p.display2();
	}
}
