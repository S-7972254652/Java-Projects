class A{
	private A();
	private void msg() {
		System.out.println("Hello Java");
	}
}
public class PackagePrivate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.msg();
	}

}
