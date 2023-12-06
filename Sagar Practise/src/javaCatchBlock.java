
public class javaCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=50/0;
		}catch(ArthmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code..");
	}

}
