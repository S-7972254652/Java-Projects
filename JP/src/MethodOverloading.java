class A{
	void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	void add(int x,int y) {
		int c;
		c=x+y;
		System.out.println(c);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
a.add(2,3);
	}

}
