interface Bank1256{
	float getRateOfinterest();
}
class SBI1444 implements Bank1256{
	public float getRateOfinterest() {return 7.78f;}
}
class PNB1545 implements Bank1256{
	public float getRateOfinterest() {return 8.5f;}
}
public class interface33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1256 b=new SBI1444();
		Bank1256 b1=new PNB1545();
		System.out.println("The Rate Of Interest Is="+b.getRateOfinterest());
		System.out.println("The Rate Of Interest Is="+b1.getRateOfinterest());
	}

}
