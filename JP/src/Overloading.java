class A99{
	void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	void add(double a,double b) {
		double c;
		c=a+b;
	}
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A99 a=new A99();
a.add();
a.add(1.2,5.3);

	}

}
