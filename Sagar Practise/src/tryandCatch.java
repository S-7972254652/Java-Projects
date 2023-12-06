
public class tryandCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=100/0;
		}catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Rest of the code");

	}

}
