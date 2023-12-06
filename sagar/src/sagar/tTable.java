package sagar;

import java.util.Scanner;

public class tTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no=");
		j=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i*j);
		}
	}

}
