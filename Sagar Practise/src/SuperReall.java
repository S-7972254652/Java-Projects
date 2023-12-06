class A99{
	int no=555;
	void display() {
		System.out.println("global");
	}
}
class B extends A99{
	int no=999;
	void display() {
		System.out.println(no);
		System.out.println(super.no);
		super.display();
	}
}
public class SuperReall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.display();
	}

}
