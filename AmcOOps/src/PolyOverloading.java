
public class PolyOverloading {
	void Add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	void Add(double x,int y) {
		double c;
		c=x+y;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyOverloading a=new PolyOverloading();
		a.Add();
		a.Add(20.5,45);
	}

}
