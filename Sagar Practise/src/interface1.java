interface Drawable{
	void draw();
}
class Rectangle implements Drawable{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=new Circle();
		d.draw();
	}

}
