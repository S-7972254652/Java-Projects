package pack;
public class A{
	protected void msg() {
		System.out.println("Hello");
	}
}
package mypack;
import pack;
public class Protected1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.msg();
	}

}
