package sagar;

import java.util.Scanner;

class Boxx33{
	int height,width,depth,volume;
	void insert(int h,int w,int d) {
		height=h;
		width=w;
		depth=d;
	}
	void calculate() {
		volume=height*width*depth;
	}
	void display() {
		System.out.println("Volume is="+volume);
	}
}
class colorbox extends Boxx33{
	String color;
	void insert1(String c) {
		color=c;
	}
	void display1() {
		System.out.println("Color is="+color);
	}
}
class Price extends colorbox{
	int amount;
	void insert2(int a) {
		amount=a;	
	}
	void display2() {
		System.out.println("Enter the amount="+amount);
	}
}
public class MultilevelInheritancees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,w,d;
		String c;
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height,width,depth,color and Amount");
		Price p=new Price();
		h=sc.nextInt();
		w=sc.nextInt();
		d=sc.nextInt();
		c=sc.next();
		a=sc.nextInt();
		p.insert(h, w, d);
		p.calculate();
		p.display();
		p.insert1(c);
		p.display1();
		p.insert2(a);
		p.display2();
	}

}
