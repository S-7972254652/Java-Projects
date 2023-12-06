package sagar;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks,pass,fail;
System.out.println("Enter the marks");
Scanner sc=new Scanner(System.in);
marks=sc.nextInt();
if(marks>=40)
	System.out.println("Congradulation!you are Pass");
else
	System.out.println("You are Fail!!");
	}

}
