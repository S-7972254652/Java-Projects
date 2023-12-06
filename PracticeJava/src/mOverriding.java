class bike{
	String color="Red";
	void run() {
		System.out.println("Bike is runing safely..");
	}
}
class Audi extends bike{
	String color="Blue";
	void run() {
		super.run();
		System.out.println("Audi is runing safely..");
		System.out.println(super.color);

		System.out.println(color);

	}
}
public class mOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a=new Audi();
		a.run();
	}

}
