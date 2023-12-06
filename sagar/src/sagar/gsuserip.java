package sagar;

import java.util.Scanner;

public class gsuserip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double bs,da,hr,gs;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the basic salary");
bs=sc.nextInt();
da=bs*0.40;
hr=bs*0.20;
gs=bs+da+hr;
System.out.println("The gross salary is:"+gs);

	}

}
