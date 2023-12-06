class Bike{
	final void run() {
		System.out.println("Runing");
	}
}
class Honda extends Bike{
	void run() {
		System.out.println("Runing Safely with 100Kmph");
	}
}
public class FinalKeywordBike {

	public static void main(String[] args) {
		Honda honda=new Honda();
		honda.run();

	}

}
