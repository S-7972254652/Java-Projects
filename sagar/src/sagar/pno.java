package sagar;

import java.util.Scanner;

public class pno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c,r,s=0;
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
			
		}
		if(c==s) {
			System.out.println("Palindrome no");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
