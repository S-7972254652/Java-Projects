package sagar;

import java.util.Scanner;

public class tbla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no=");
		i=sc.nextInt();
		for(int k=1;k<=10;k++) {
			System.out.println(i*k);
		}
	}

}
