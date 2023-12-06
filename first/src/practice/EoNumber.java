package practice;

import java.util.Scanner;

public class EoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		a=sc.nextInt();
		if(a%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd No");
		}
	}

}
