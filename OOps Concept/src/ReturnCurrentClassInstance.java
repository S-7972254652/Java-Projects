class A{
	A getA() {
		return this;
	}
	void msg() {
		System.out.println("Hello Java");
	}
}
public class ReturnCurrentClassInstance {

	public static void main(String[] args) {
	new A().getA().msg();

	}

}
