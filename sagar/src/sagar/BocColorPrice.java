package sagar;

import java.util.Scanner;

class Box{
	double length,width,height,area;
	void insert(double l,double w,double h) {
		length=l;
		width=w;
		height=h;
	}
	void calculate() {
		area=length*width*height;
	}
	void display() {
		System.out.println("Area is="+area);
	}
}
class Colorbox extends Box{
	String color;
	void insert1(String c) {
		color=c;
	}
	void display1() {
		System.out.println("Enter the color="+color);
	}
}
class Price extends Colorbox{
	int amount;
	void insert2(int am) {
		amount=am;
	}
	void display2() {
		System.out.println("Enter the amount="+amount);
	}
}
public class BocColorPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l,w,h;
		String c;
		int am;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length,width,height,color and amount");
		l=sc.nextDouble();
		w=sc.nextDouble();
		h=sc.nextDouble();
		c=sc.next();
		am=sc.nextInt();
		Price p=new Price();
		p.insert(l, w, h);
		p.calculate();
		p.display();
		p.insert1(c);
		p.display1();
		p.insert2(am);
		p.display2();
	}

}
