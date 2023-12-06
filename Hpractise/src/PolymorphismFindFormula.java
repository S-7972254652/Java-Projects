class Shape{
	void calculateArea() {
		System.out.println("The formula to find area is = ");
	}
}
class Circle extends Shape{
	void calculateArea() {
		System.out.println("Area of circle=3.14*radius*radius");
	}
}
class Triangle extends Shape{
	void calculateArea() {
		System.out.println("Area of triangle=0.5*base*height");
	}
}
public class PolymorphismFindFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		Circle c=new Circle();
		Triangle t=new Triangle();
		s.calculateArea();
		c.calculateArea();
		t.calculateArea();

	}

}
