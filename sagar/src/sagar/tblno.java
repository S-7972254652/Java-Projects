package sagar;

import java.util.Scanner;

public class tblno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		a=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a*i);
		}
	}

}