package sagar;
class A{
	int a=20;
	void show() {
		
	}
}
class B extends A{
	int a=40;
	void show() {
		System.out.println(super.a);
	}
}
public class SuperA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B r=new B();
		r.show();
	}

}
