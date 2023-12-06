class A11{
	final void m1() {
		System.out.println("I'm m1 class");
	}
}
class B extends A11{
	void m1() {
		System.out.println("Im 2nd M1");
	}
}
public class finalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new B();
b.m1();
	}//here in this program we are extend the final method so it will shows an error.

}
