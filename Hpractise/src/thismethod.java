class A{
	int a=20;
	void m() {
		System.out.println("Hii");
	}
	void n() {
		int a=24;
		this.m();
		System.out.println(this.a);
	}
}
public class thismethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
a.n();
	}

}
