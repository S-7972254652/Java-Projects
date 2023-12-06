package sagar;
class Bike9994{
	void run() {
		System.out.println("Bike is runing..");
	}
}
class motor extends Bike9994{
	void run() {
		System.out.println("Motor is Runing..");
		//System.out.println("Motor is Runing.."+run);
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		motor m=new motor();
		m.run();
		Bike9994 b=new Bike9994();
		b.run();
	}

}
