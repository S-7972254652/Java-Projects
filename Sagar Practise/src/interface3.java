interface Printable{
	void print();
}
interface showable{
	void show();
}
class A7 implements Printable,showable{
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.print("Welcome");
	}
}
public class interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A7 obj=new A7();
		obj.print();
		obj.show();
	}

}
