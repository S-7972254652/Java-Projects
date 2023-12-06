abstract class Vehicle{
	int tyres;
	abstract void start();
}
class scooter extends Vehicle{
	int tyres=2;

	@Override
	void start() {
		// TODO Auto-generated method stub
	System.out.println("Scooter is Start with kick");	
	}
	
}
class car extends Vehicle{
	int tyres=4;
	void start() {
		System.out.println("Car is start with key..");
	}
}
public class AbstractKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car c=new car();
c.start();
scooter s=new scooter();
s.start();
	}

}
//Note:in abstract class if we declared method with abstract keyword then it is compulsoury to make the class abstrct
//we can not create the object of abstract class.
//