interface Drawable44{
	void draw();
	default void msg() {
		System.out.println("Default Method");
	}
}
class Rectangle56 implements Drawable44{
	public void draw() {
		System.out.println("Drawing Rectangle..");
	}
}
public class interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable44 d=new Rectangle56();
		d.draw();
		d.msg();
	}

}
