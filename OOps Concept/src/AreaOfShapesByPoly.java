import java.util.Scanner;

class Shape7{
	void draw() {
		System.out.println("drawing..");
	}
	void insert()
	{	
	}
	void calculate() {}
	void display() {}
}
class Rectangle7 extends Shape7{
	int length,width,area;
	void insert() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and width of rectangle");
		length=sc.nextInt();
		width=sc.nextInt();
		}
	void calculate() {
		area=length*width;
	}
	void display() {
		System.out.println("area="+area);
	}
}
class Circle7 extends Shape7{
	double radius,area;
	void insert() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		radius=sc.nextDouble();
	}
	void calculate() {
		area=3.14*radius*radius;
	}
	void display() {
		System.out.println("area="+area);
	}
}
class Triangle7 extends Shape7{
	double base,height,area;
	void insert() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base and height of triangle");
		base=sc.nextDouble();
		height=sc.nextDouble();
	}
	void calculate() {
		area=0.5*base*height;
	}
	void display() {
		System.out.println("area="+area);
	}
}
public class AreaOfShapesByPoly {

	public static void main(String[] args) {
	Shape7 s;
	s=new Rectangle7();
	s.insert();
	s.calculate();
	s.display();
	s=new Circle7();
	s.insert();
	s.calculate();
	s.display();
	s=new Triangle7();
	s.insert();
	s.calculate();
	s.display();

	}
}

