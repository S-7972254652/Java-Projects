class Test{
	void Phone() {
		System.out.println("123456789");
	}
	final void ATM() {
		System.out.println("1235");
	}
}
class Thief extends Test{
	void Phone() {
		System.out.println("123456789");
	}
	void ATM() {
		System.out.println("1235");
	}
}
public class afinalKeywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thief t=new Thief();
t.Phone();
t.ATM();

	}

}
