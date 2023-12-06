package sagar;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
System.out.println("Enter the first angle");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.println("Enter the second angle");
b=sc.nextInt();
System.out.println("Enter the third angle");
c=sc.nextInt();
if(a+b+c==180)
{
	System.out.println("Valid Triangle");
}
else {
	System.out.println("Invalid Triangle");
}

	}

}
