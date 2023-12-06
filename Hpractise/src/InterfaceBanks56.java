interface Banks1002{
void getRateOfInterest();	
}
class Sbi5647 implements Banks1002{
	public void getRateOfInterest() {
		System.out.println(7.8);
	}
}
class Union implements Banks1002{
	public void getRateOfInterest() {
		System.out.println(7);

	}
}
public class InterfaceBanks56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Banks1002 b=new Sbi5647();
b.getRateOfInterest();
Banks1002 b1=new Union();
b1.getRateOfInterest();
	}

}
