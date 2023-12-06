package sagar;

import java.util.Scanner;

public class SwappingOfTwoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		int t;
		//t=a;a=b;b=t
		t=a;
		a=b;
		b=t;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
