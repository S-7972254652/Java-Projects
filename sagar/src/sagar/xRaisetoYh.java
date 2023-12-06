package sagar;

import java.util.Scanner;

public class xRaisetoYh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,n=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value");
		x=sc.nextInt();
		System.out.println("Enter the exp value");
		y=sc.nextInt();
		while(y>=1) {
			n=x*n;
			y=y-1;
		}
		System.out.println(n);
	}

}
