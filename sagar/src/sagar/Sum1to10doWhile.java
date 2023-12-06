package sagar;

import java.util.Scanner;

public class Sum1to10doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,fact=1;
System.out.println("Enter tne no");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
do {
	fact=fact*a;
	a--;
}while(a>0);
System.out.println("Factorial is"+fact);

	}

}
