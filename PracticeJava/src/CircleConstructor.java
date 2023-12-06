import java.util.Scanner;

class Circle{
	double radius,area;
	Circle(double r){
		radius=r;
	}
	void calculate() {
		area=3.14*radius*radius;
	}
	void display() {
		System.out.println(area);
	}
}
public class CircleConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		
		Circle c=new Circle(5);
		c.calculate();
		c.display();
	}

}
