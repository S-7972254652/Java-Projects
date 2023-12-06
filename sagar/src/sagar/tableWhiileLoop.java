package sagar;

import java.util.Scanner;

public class tableWhiileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,i=1;
System.out.println("Enter the no:");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(i<=10)
{
	System.out.println(num*i);
	i++;
}
	}

}
