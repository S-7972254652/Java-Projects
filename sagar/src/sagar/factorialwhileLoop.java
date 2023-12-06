package sagar;

import java.util.Scanner;

public class factorialwhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,fact=1;
System.out.println("Enter the values");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
while(a>0) {
	fact=fact*a;
	a--;
}
System.out.println("Factorial is:"+fact);
	}

}
