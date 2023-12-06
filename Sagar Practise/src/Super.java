class A{
	int a=555;
	void display() {
		int a=999;
		System.out.println(a);
		System.out.println(this.a);
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
a.display();
	}

}
