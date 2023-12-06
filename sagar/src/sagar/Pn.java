package sagar;

import java.util.Scanner;

public class Pn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c,s=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no=");
		n=sc.nextInt();
		c=n;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not Palindrome Number");
		}
	}

}
