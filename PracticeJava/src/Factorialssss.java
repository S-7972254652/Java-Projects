import java.util.Scanner;

public class Factorialssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		no=sc.nextInt();
		for(int i=1;i<=no;i++) {
			fact=fact*i;
		}
		System.out.println("The Factorial is="+fact);
	}

}