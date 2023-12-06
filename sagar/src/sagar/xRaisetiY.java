package sagar;

import java.util.Scanner;

public class xRaisetiY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,n;
System.out.println("Enter the base value");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
System.out.println("Enter the exponential value");
y=sc.nextInt();
for(n=1;y>=1;y=y-1)
{
	n=x*n;
	System.out.println(n);
}

	}

}
