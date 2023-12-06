package sagar;

import java.util.Scanner;

class Circle999{
	int radius;
	double area;
	void insert(int r) {
		radius=r;
	}
	void calculate() {
		area=3.14*radius*radius;
	}
	void display() {
		System.out.println("Area of circle is="+area);
	}
}
public class CIrclecccc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		System.out.println("Radius is=");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		Circle999 c=new Circle999();
		c.insert(r);
		c.calculate();
		c.display();
	}

}
