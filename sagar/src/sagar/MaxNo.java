package sagar;

import java.util.Scanner;

class max{
	int no1,no2,no3;
	void insert(int n1,int n2,int n3) {
		no1=n1;
		no2=n2;
		no3=n3;
	}
	void calculate() {
		if(no1>no2 && no1>no3) {
			System.out.println("Number1 is grater="+no1);
		}
		else if(no2>no1 && no2>no3) {
			System.out.println("Number2 is grater="+no2);
		}
		else {
			System.out.println("Number3 is grater="+no3);
		}
	}
}
public class MaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,no3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no1,no2 and no3");
		no1=sc.nextInt();
		no2=sc.nextInt();
		no3=sc.nextInt();
		max m=new max();
		m.insert(no1, no2, no3);
		m.calculate();
	}

}
