interface I1{
	void show();
}
interface I3{
	void display();
}

class I2 implements I1,I3{
	public void show() {
		System.out.println("Show");
	}
	public void display() {
		System.out.println("Multiple Inheritance");
	}
}
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
I2 i=new I2();
i.display();
i.show();
	}

}
