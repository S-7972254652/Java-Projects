abstract class Bike{
abstract void run();
}
class Splender extends Bike{
	void run() {
		System.out.println("Splender runs with 40Kmph");
	}
}
class Activa extends Splender{
	void run() {
		System.out.println("Activa runs with 45Kmph");
	}
}
public class AbstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike b=new Activa();
b.run();
	}

}
