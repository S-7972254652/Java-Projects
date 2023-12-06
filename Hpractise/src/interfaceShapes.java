interface Shape995{
	void draw();
}
class Circle588 implements Shape995{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
class Square implements Shape995{
	public void draw() {
		System.out.println("Drawing Square");
	}
}
public class interfaceShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape995 s=new Circle588();
s.draw();
Shape995 s1=new Square();
s1.draw();
	}

}
