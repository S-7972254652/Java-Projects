package pack;
public class A{
	public void msg() {System.out.println("Hello");}
}
package mypack;
import pack;
public class PublicPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj=new A();
obj.msg();
	}

}
