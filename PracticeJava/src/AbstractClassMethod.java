abstract class Shape{
	abstract void draw();	
}
class rectangle extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle..");
	}
}
class Circle1004 extends rectangle{
	void draw() {
		System.out.println("Drawing Circle..");

	}
}

public class AbstractClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape c=new Circle1004();
c.draw();
Shape c1=new rectangle();
c1.draw();
	}

}
