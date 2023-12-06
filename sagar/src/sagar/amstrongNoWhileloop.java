package sagar;

import java.util.Scanner;

public class amstrongNoWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,r,c,s=0;
System.out.println("Enter the no:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
c=n;
while(n>0)
{
	r=n%10;
	s=r+(s*10);
	n=n/10;
}
if(c==s) {
	System.out.println("Palindrome No");
}
else
{
	System.out.println("Other no");
}
	}

}
