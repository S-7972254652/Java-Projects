package sagar;

import java.util.Scanner;

public class CtoFuserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double f,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the temp in farenheit");
f=sc.nextInt();
c=(f-32)*5/9;
System.out.println("Temperature in degree c is:"+c);
	}

}
