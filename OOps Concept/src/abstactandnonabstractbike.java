abstract class Biker{
	Biker(){
		System.out.println("Bike is Created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear Changed");
	}
}
	class Honda101 extends Biker{
		void run() {
			System.out.println("Runing Safely..");
		}
	}
	

public class abstactandnonabstractbike {

	public static void main(String[] args) {
		Biker obj=new Honda101();
		obj.run();
		obj.changeGear();  
	}

}
