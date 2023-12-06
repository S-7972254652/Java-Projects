
public class FinallyBlocked {

	public static void main(String[] args) {
	try {
		System.out.println("First Statement");
		int data=550/0;
		System.out.println("After Error Statement");
	}catch(NullPointerException e) {
		System.out.println("Catch Statement");
	}
	finally {
		System.out.println("This is compulsary executed statement");
	}
	}

}
