 interface Drawable1252{
	void draw();
}
class Rectangle1125 implements Drawable1252{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Circle55689 implements Drawable1252{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
public class interfacedrawable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Drawable1252 d=new Circle55689();
d.draw();

	}

}
