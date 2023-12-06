class Bike100{
	void run() {
		System.out.println("Runing");
	}
}
	class splendor extends Bike100{
		void run() {
			System.out.println("Runing Safely with 60KMPH");
		}
	}

public class BikePolymorphism {

	public static void main(String[] args) {
	Bike100 b=new splendor();
	b.run();

	}

}
