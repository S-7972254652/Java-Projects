package sagar;

import java.util.Scanner;

public class percentageinputUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int s1,s2,s3,s4,s5,aggregatemarks;
double percentage;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks of s1"+s1);
s1=sc.nextInt();
System.out.println("Enter the marks of s2"+s2);
s2=sc.nextInt();
System.out.println("Enter the marks of s3"+s3);
s3=sc.nextInt();
System.out.println("Enter the marks of s4"+s4);
s4=sc.nextInt();
System.out.println("Enter the marks of s5"+s5);
s5=sc.nextInt();
aggregatemarks=s1+s2+s3+s4+s5;
percentage=aggregatemarks/5;
System.out.println("You obtain the aggregate marks"+aggregatemarks);
System.out.println("You obtain the percentage"+percentage);

	}

}
