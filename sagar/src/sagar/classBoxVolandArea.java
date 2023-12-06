package sagar;

import java.util.Scanner;

class Box5768{
	double length,width,height,area,volume;
	void insert(double l,double w,double h) {
		length=l;
		width=w;
		height=h;
	}
	void calculatearea() {
	area=2*(length*width)+2*(length*height)+2*(width*height);
	}
	void calculatevolume() {
		volume=length*width*height;
	}
	void displayarea() {
		System.out.println("Area is"+area);
	}
	void displayvolume() {
		System.out.println("Volume is"+volume);
	}
}
public class classBoxVolandArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l,w,h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length,width and height");
		l=sc.nextDouble();
		w=sc.nextDouble();
		h=sc.nextDouble();
		Box5768 b=new Box5768();
		b.insert(l,w,h);
		b.calculatearea();
		b.displayarea();
		b.calculatevolume();
		b.displayvolume();
	}

}
