import java.util.Scanner;

public class SwapNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a,b,t");
		a=sc.nextInt();
		b=sc.nextInt();
		
		t=a;
		a=b;
		b=t;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
	}

}
