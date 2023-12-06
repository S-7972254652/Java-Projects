abstract class Bank{
	abstract void rateOfInterest();
}
class Sbi extends Bank{
	void rateOfInterest() {
		System.out.println("7.78");
	}
}
class PNB extends Sbi{
	void rateOfInterest() {
		System.out.println("4");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PNB p=new PNB();
p.rateOfInterest();
Sbi s=new Sbi();
s.rateOfInterest();
//Bank b=new Bank();
//b.rateOfInterest();
	}

}
