
public class TestFinallyu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a=50/0;
}catch(Exception e) {
	System.out.println(e);
}
finally {
	System.out.println("You sre in finally block");
}
	}

}
