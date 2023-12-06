package sagar;
class Bike{
	void run() {
		System.out.println("Bike is runing..");
	}
}
class Splendor extends Bike{
	void run(){
		System.out.println("Bike is Runing Safely..");
	}
}
public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Splendor();
		b.run();

	}

}
