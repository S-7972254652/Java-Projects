package sagar;

import java.util.Scanner;

public class sum1to10while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,sum,i=0;
System.out.println("Enter the no");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(i<=num) {
	sum=sum+i;
	i++;
}
System.out.println("ans is:"+sum);
	}

}
