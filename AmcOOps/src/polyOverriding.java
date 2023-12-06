class Shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
}
class Square extends Shape{
	@Override
	void draw() {
		super.draw();
		System.out.println("Drawng Square");
	}
}
public class polyOverriding {

	public static void main(String[] args) {
Shape s=new Square();
s.draw();
	}
}
