package sagar;
class A11{
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
public class Moverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A11 r=new A11();
		r.add(100,20);
				}

}
