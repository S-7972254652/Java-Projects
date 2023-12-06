package sagar;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no,reminder,rever=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no");
no=sc.nextInt();
while(no!=0) {
	reminder=no%10;
	rever=(rever*10)+reminder;
	no=no/10;
}
System.out.println(rever);
	}

}
