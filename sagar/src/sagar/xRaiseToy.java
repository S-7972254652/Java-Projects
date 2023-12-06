package sagar;

import java.util.Scanner;

public class xRaiseToy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,n=1;
System.out.println("Enter the base no");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
System.out.println("Enter the Exp value");
y=sc.nextInt();
do {
	n=x*n;
	y=y-1;
}while(y>=1);
System.out.println("Resule of x raise to y is:"+n);
	}

}
