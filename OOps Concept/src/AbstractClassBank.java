abstract class bank{
	abstract int getRateOfinterest();
}
class sbi extends bank{
	int getRateOfinterest(){return 7;}
}
class PNB extends bank {
	int getRateOfinterest(){return 8;}
}
public class AbstractClassBank {

	public static void main(String[] args) {
	bank b;
	b=new sbi();
	System.out.println("Rate of interest is:"+b.getRateOfinterest()+"%");
	b=new PNB();
	System.out.println("Rate of interest is:"+b.getRateOfinterest()+"%");
	}

}