interface Shape{
	void display();
}
abstract class circle implements Shape{
	double radius,area;
	void insert(double r) {
		radius=r;
	}
	void calculate() {
		area=3.14*radius*radius;
	}
	public void display() {
		System.out.println("area="+area);
	}
}
abstract class Rectangle implements Shape{
	double length,width,area;
	void insert(double l,double w){
		length=l;
		width=w;
	}
	void calculate() {
		area=length*width;
	}
	void display() {
		System.out.println("area="+area);
	}
}
public class Shapeinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
