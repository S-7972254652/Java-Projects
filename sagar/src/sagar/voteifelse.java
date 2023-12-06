package sagar;

import java.util.Scanner;

public class voteifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age;
System.out.println("Enter your age:");
Scanner sc=new Scanner(System.in);
age=sc.nextInt();
if(age>18)
	System.out.println("You must go for Voting");
else
	System.out.println("Sorry!you are not eligible");
	}

}
