package sagar;

import java.util.Scanner;

public class Eexc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		//a==b==t
		t=a;
		a=b;
		b=t;
		System.out.println("Enter the a="+a);
		System.out.println("Enter the b="+b);
	}

}
