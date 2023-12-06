import java.util.Scanner;

interface Shape{
	void display();

	void insert();

	void calculate();
}
class Circle implements Shape{
	double radius,area;
	void insert(double r) {
		radius=r;
	}
	public void calculate() {
		area=3.14*radius*radius;
	}
	public void display() {
		System.out.println("area="+area);
	}
	
}
class Rectangle implements Shape{
	double length,width,area;
	void insert(double l,double w) {
		length=l;
		width=w;
	}
	public void calculate() {
		area=length*width;
	}
	public void display() {
		System.out.println("area="+area);
	}
}
public class interFaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r,l,w;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius,length and width");
		r=sc.nextDouble();
		l=sc.nextDouble();
		w=sc.nextDouble();
		Shape s=new Circle();
		s.insert(r);
		s.calculate();
		s.display();
		Shape s=new Rectangle();
		s.insert(l,w);
		s.calculate();
		s.display();
		
	}

}
