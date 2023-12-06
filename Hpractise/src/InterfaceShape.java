interface shape{
	void draw();
}
class Circle implements shape{
	public void draw() {
		System.out.println("Drawing Circle..");
	}
}
class Rectangle implements shape{
	public void draw() {
		System.out.println("Drawing Rectangle..");
	}
}
public class InterfaceShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
shape s=new Circle();
s.draw();
shape s1=new Rectangle();
s1.draw();
	}

}
