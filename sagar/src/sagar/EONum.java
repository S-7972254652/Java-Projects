package sagar;

import java.util.Scanner;

public class EONum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Even No");
		}
		else {
			System.out.println("Odd no");
		}
	}

}
