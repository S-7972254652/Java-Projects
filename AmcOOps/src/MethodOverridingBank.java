class Bank{
	int getRateOfInterest() {return 0;}
}
class Sbi extends Bank{
	int getRateOfInterest() {return 7;}
}
class Bob extends Bank{
	int getRateOfInterest() {return 2;}
}
class Axis extends Bank{
	int getRateOfInterest() {return 35;}
}
public class MethodOverridingBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b2=new Bank();
Sbi s=new Sbi();
Bob b=new Bob();
Axis a=new Axis();
b2.getRateOfInterest();
s.getRateOfInterest();
b.getRateOfInterest();
a.getRateOfInterest();
System.out.println("The Bank rate of interest = "+b2.getRateOfInterest());
System.out.println("The SBI rate of interest = "+s.getRateOfInterest());
System.out.println("The Axis rate of interest = "+a.getRateOfInterest());
System.out.println("The Bob rate of interest = "+b.getRateOfInterest());


	}

}
