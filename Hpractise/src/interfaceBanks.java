interface Banks{
	 void getrateOfInterest();
}
class Sbi53 implements Banks{
	public void getrateOfInterest() {
		System.out.println("7.78");
	}
}
class Pnb implements Banks{
	public void getrateOfInterest() {
		System.out.println("6.800");
	}
}
public class interfaceBanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Banks b=new Sbi53();
b.getrateOfInterest();
	}

}
