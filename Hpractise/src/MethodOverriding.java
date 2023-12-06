class Bank{
	 int getRateOfInterest() {return 7;};
}
class Abc514 extends Bank {
	int getRateOfInterest() {
		return 80;
	}
}
class Cde extends Abc514{
	int getRateOfInterest() {
		return 90;
	}
}
class Efg extends Cde{
	int getRateOfInterest() {
		return 7;
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abc514 c=new Abc514();
Cde e=new Cde();
Efg g=new Efg();
System.out.println("The Abc returns = "+c.getRateOfInterest());
System.out.println("The Cde returns = "+e.getRateOfInterest());
System.out.println("The Efg returns = "+g.getRateOfInterest());

	}

}
