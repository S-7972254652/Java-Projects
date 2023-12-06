package sagar;

import java.util.Scanner;

public class xRaisetoYwhilleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,n=1;
System.out.println("Enter the base value:");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
System.out.println("Enter the exponential value:");
y=sc.nextInt();
while(y>=1) {
	n=n*x;
	y=y-1;
}
System.out.println("Ans is:"+n);
	}

}
