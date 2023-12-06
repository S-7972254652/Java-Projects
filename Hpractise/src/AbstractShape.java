abstract class Shape199{
	abstract void draw();
}
class Circle45 extends Shape199{
	void draw() {
		System.out.println("Drawing Circle..");
	}
}
class Triangle54 extends Shape199{
	void draw() {
		System.out.println("Drawing Triangle");
	}
}
public class AbstractShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape199 s=new Circle45();
s.draw();
Shape199 s1=new Triangle54();
s1.draw();
	}

}
