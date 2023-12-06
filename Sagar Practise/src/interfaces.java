interface Printable5568{
	void print();
}
interface Showable extends Printable5568{
	void show();
}
class Testinterface4 implements Showable{
	public void print() {System.out.println("Hello");}
	public void show() {System.out.println("Welcome");}	
}
public class interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testinterface4 obj=new Testinterface4();
		obj.print();
		obj.show();
	}
}
