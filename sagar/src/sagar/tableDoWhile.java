package sagar;

import java.util.Scanner;

public class tableDoWhile {

	public static void main(String[] args) {
		// Table Program
		
		int num,i=1;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		do
		{
			System.out.println(num*i);
			i++;
		}while(i<=10);
	}

}
