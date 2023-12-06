class A{
	void insert(int a,int b) {
		System.out.println(a+b);
	}
	void insert(double a,double b) {
		System.out.println(a+b);
	}
}
public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
a.insert(5.10, 40);
	}

}
