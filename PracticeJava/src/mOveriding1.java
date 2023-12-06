class Dog89{
	void run() {
		System.out.println("Barking...");
	}
}
class Man extends Dog89{
	void run() {
		super.run();
		System.out.println("Money...");
	}
}
public class mOveriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Man m=new Man();
m.run();
	}

}
