package sagar;

import java.util.Scanner;

public class tabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		i=sc.nextInt();
		for(int j=1;j<=10;j++) {
			System.out.println(i*j);
		}
	}

}
