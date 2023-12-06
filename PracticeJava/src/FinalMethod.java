class Test{
	void phoneNumber() {
		System.out.println("7798955640");
	}
	final void atmPIN() {
		System.out.println("4253");
	}
}
class Hacker extends Test{
	void phoneNumber() {
		System.out.println("7798955640");
	}
	void atmPIN() {
		System.out.println("4253");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hacker h=new Hacker();
h.phoneNumber();
h.atmPIN();
	}

}
