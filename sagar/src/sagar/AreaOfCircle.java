package sagar;
class Circle{
	double radius,area;
	Circle(double r){
		radius=r;
	}
	void calculate() {
		area=3.14*radius*radius;
	}
	void display() {
		System.out.println("Area of circle is:"+area);
	}
}
public class AreaOfCircle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(40);
		Circle c2=new Circle(80);
		c1.calculate();
		c1.display();
		c2.calculate();
		c2.display();
	}

}
