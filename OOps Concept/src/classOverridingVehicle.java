class Vehicle{
	void run() {
		System.out.println("Vehicle is runing");
	}
}
class Bike extends Vehicle{
	
}
public class classOverridingVehicle {

	public static void main(String[] args) {
		 Bike obj = new Bike();
		 obj.run();
	}

}
