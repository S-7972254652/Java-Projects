package sagar;

import java.util.Scanner;

public class Factrrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		no=sc.nextInt();
		for(int i=1;i<=no;i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
