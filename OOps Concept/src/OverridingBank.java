class Bank{
	int getRateOfinterest() {
		return 0;
	}
}
	class SBI extends Bank{
		int getRateOfinterest() 
		{return 8;}
	}
	class ICICI extends Bank{
		int getRateOfinterest() 
		{return 7;}
	}
		class AXIS extends Bank{
		int	getRateOfinterest(){return 7;}
	}
		

public class OverridingBank {

	public static void main(String[] args) {
	SBI s=new SBI();
	ICICI i=new ICICI();
	AXIS a=new AXIS();
System.out.println("SBI rate of interest"+s.getRateOfinterest());
System.out.println("ICICI rate of interest"+s.getRateOfinterest());
System.out.println("AXIS rate of interest"+s.getRateOfinterest());

	}

}
