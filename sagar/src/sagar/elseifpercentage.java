package sagar;

import java.util.Scanner;

public class elseifpercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks obtained");
marks=sc.nextInt();
if(marks>=90)
{
	System.out.println("A+");
}
else if(marks>=80&&marks<90)
{
	System.out.println("A");
}
else if(marks>=70&&marks<80)
{
	System.out.println("B+");
}
else if(marks>=60&&marks<70)
{
	System.out.println("B");
}
else if(marks>=50&&marks<60)
{
	System.out.println("B+");
}
else {
	System.out.println("Fail!*");
}
	}

}
