package sagar;

import java.util.Scanner;

class Circle{
	double area,radius;
	static double pi=3.14;
	Circle(double r){
		radius=r;
	}
	void calculate()
	{
		area=3.14*radius*radius;
	}
	void display() {
		System.out.println("area="+area);
	}
}
public class StaticAOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=sc.nextDouble();
		Circle c=new Circle(r);
		c.calculate();
		c.display();
	}

}
