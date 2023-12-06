class akar{
	void draw() {
		System.out.println("drawing..");
	}
}
class rect extends akar{
	void draw() {
		System.out.println("drawing Rectangle");
	}	
}
class We extends akar{
	void draw() {
		System.out.println("drawing Circle");
	}	
}
class tri extends akar{
	void draw() {
		System.out.println("drawing Triangle");
	}	
}
public class ShapeByRpolymorphism {

	public static void main(String[] args) {
		akar s;
		s=new rect();
		s.draw();
		s=new We();
		s.draw();
		s=new tri();
		s.draw();

	}

}
