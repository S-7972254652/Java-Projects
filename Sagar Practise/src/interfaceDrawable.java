interface Drawable595{
	void draw();
}
class Rectangle interface Drawable595{
	public void draw() {System.out.println("Drawing Circles..");}
}
class Circle interface Drawable595{
	public void draw() {
		System.out.println("Drawing circle..");
	}
}
public class interfaceDrawable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable595 d=new Circle();
		d.draw();
	}

}
