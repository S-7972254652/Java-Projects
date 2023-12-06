package sagar;

import java.util.Scanner;

class Cricket{
	int score;
	String name;
	void insert(int s,String n) {
		score=s;
		name=n;
	}
	void display() {
		System.out.println("Enter the Score"+score);
		System.out.println("Enter the name"+name);
	}
}
class Football extends Cricket{
	int goal;
	String player;
	void insert1(int g,String p) {
		goal=g;
		player=p;
	}
	void display1() {
		System.out.println("Enter the goals"+goal);
		System.out.println("Enter the Players Name="+player);
	}
}
public class Crick {

	public static void main(String[] args) {

		int s,g;
		String n,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score,name,goal and player name");
		Football f=new Football();
		s=sc.nextInt();
		g=sc.nextInt();
		n=sc.next();
		p=sc.next();
		f.insert(s, n);
		f.display();
		f.insert1(g, p);
		f.display1();
		
	
	}

}
