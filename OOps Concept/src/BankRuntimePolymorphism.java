class store{
	float getRateOfInterest() {return 0;}
}
class sbi extends store{
	float getRateOfInterest() {return 8.4f;}
}
class icici extends store{
	float getRateOfInterest() {return 7.3f;}
}
class axis extends store{
	float getRateOfInterest() {return 9.7f;}
}


public class BankRuntimePolymorphism {

	public static void main(String[] args) {
		store b;
	b=new sbi();
	System.out.println("SBI rate of interest"+b.getRateOfInterest());
	b=new icici();
	System.out.println("ICICI rate of interest"+b.getRateOfInterest());
	b=new axis();
	System.out.println("AXIS rate of interest"+b.getRateOfInterest());

	}

}
