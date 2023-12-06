package practice;

import java.util.Scanner;

class Student{
	int roll,standard;
	String name,division;
	void insert(int r,int std,String n,String div) {
		roll=r;
		standard=std;
		name=n;
		division=div;
	}
	void display() {
		System.out.println("Roll No:"+roll);
		System.out.println("Standard:"+standard);
		System.out.println("Name:"+name);
		System.out.println("Division:"+division);
	}
}
class marks extends Student{
	int mr;
	void insert1(int m) {
		mr=m;
	}
	void display1() {
		System.out.println("Marks"+mr);
	}
}
public class stdmarkStudent {

	public static void main(String[] args) {
		int r, std;
		String n, div;
		int mr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll no,Standard,name,division and marks");
		r=sc.nextInt();
		std=sc.nextInt();
		n=sc.next();
		div=sc.next();
		mr=sc.nextInt();
	}

}
