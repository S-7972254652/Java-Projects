class Adder0253{
	void add(int a,int b) {
		//return a+b;
		System.out.println("int is print");
	}
	void add(double a,double b) {
		System.out.println("Double is printed");
	}
}
public class Moverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Adder0253 obj=new Adder0253();
obj.add(5, 5);
	}

}
