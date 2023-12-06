package sagar;

import java.util.Scanner;

class Triangle998{
	double base,height,area;
	void insert(double b,double h) {
		base=b;
		height=h;
	}
	void calculate() {
		area=0.5*base*height;
	}
	void display() {
		System.out.println("Area of Triangle is="+area);
	}
}
public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b,h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and height");
		b=sc.nextDouble();
		h=sc.nextDouble();
		Triangle998 t=new Triangle998();
		t.insert(b, h);
		t.calculate();
		t.display();
	}

}
