package practice;
class A{
	void Subtraction() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	void Subtraction(int x,int y) {
		int c;
		c=x+y;
		System.out.println(c);
	}
}
public class Overloading {

	public static void main(String[] args) {
		A r=new A();
		r.Subtraction();

	}

}
