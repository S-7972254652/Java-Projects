import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		t=a;
		a=b;
		b=t;
		System.out.println("a = "+a);
		System.out.println("b= "+b);		

	}

}
