interface Bank002{
	float rateOfinterest();
}
class SBI1145 implements Bank{
	public float rateOfinterest() {return 9.15f;}
}
class PNB2225 implements Bank{
	public float rateOfinterest() {return 9.7f;}
}
public class interfaceBanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank002 b=new SBI11145();
		System.out.println("SBI rate of interest="+b.rateOfinterest());
	}

}
