abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	void run() {
		System.out.println("Bike Is Runing With 60KmPh");
	}
}
class Maruti extends Bike{
	void run() {
		System.out.println("Car is runing with 100Kmph");
	}
}
public class AbstractBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike b=new Honda();
b.run();
Bike b1=new Maruti();
b1.run();
	}

}
