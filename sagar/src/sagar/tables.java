package sagar;

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		num=sc.nextInt();
		do {
			System.out.println(num*i);
			i++;
		}while(i<=10);
	}

}
