
public class javaNestedTryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				System.out.println("Going to divide");
				int b=39/0;
			}catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try {
				int a[]=new int[5];
				a[5]=4;
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Other Statement");
			}catch(Exception e) {
				System.out.println("Handled")
			}
		}
	}

}
