abstract class two{
	abstract void run();
}
class Honda4 extends two{
	void run() {
		System.out.println("Runing Safely");
	}
}
public class AbstractClassBike {

	public static void main(String[] args) {
	two obj=new Honda4();
	obj.run();

	}

}
