package sagar;

import java.util.Scanner;

public class s1to10OddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		no=sc.nextInt();
		
		if(no%2==0) {
			System.out.println("Even No");
		}
		else {
			System.out.println("ODD No");
		}
	}

}
