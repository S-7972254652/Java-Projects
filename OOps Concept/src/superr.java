class A12{
	int b=50;
	void display() {
		System.out.println("B is local");
	}
}
class B44 extends A12{
	int b=43;
	void display() {
		System.out.println("Hello!"+b);
	}
}
public class superr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B44 r=new B44();
		r.display();
	}

}
