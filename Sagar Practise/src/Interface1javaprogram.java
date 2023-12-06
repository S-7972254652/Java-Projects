interface printable005{
	void print();
}
class A6 implements printable005{
	public void print() {
		System.out.println("Hello");
	}
}
public class Interface1javaprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 obj=new A6();
		obj.print();
	}

}
