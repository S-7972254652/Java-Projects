class A{
	private int data=40;
	public void msg() {
		System.out.println("Hello");
	}
}

public class PackagePrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		System.out.println(obj.data);
		obj.msg();
	}

}
