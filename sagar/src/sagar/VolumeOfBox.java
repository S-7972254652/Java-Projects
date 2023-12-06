package sagar;

import java.util.Scanner;

class Box9986{
	double length,width,height,volume;
	void insert(double l,double w,double h) {
		length=l;
		width=w;
		height=h;
	}
	void calculate() {
		volume=2*(length*width)+2*(length*height)+2*(width*height);
	}
	void display() {
		System.out.println("The volume of box is="+volume);
	}
}
public class VolumeOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h,w,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height,width and length=");
		h=sc.nextDouble();
		w=sc.nextDouble();
		l=sc.nextDouble();
		Box9986 b=new Box9986();
		b.insert(l, w, h);
		b.calculate();
		b.display();
	}

}
