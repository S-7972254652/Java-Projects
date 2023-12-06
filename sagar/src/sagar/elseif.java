package sagar;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,even,odd;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("Even no");
		}
		else {
			System.out.println("Odd no");
		}
	}

}
