interface Bank{
	float rateofinterest();
}
class SBI implements Bank{
	public float rateofinterest() {return 9.15f;}
}
class PNB implements Bank{
	public float rateofinterest() {return 9.7f;}
}
public class interfaceBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b=new SBI();
System.out.println("ROI"+" "+b.rateofinterest());
	}

}
