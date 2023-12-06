import java.util.Scanner;

class Box{
	double height,width,depth,volume;
	void insert(double h,double w,double d) {
		height=h;
		width=w;
		depth=d;
	}
	void calculate() {
		volume=height*width*depth;
	}
	void display() {
		System.out.println("Volume is = "+volume);
	}
}
class Colorbox extends Box{
	String Color;
	void insert1(String c) {
		Color=c;
	} 
	void display1() {
		System.out.println("Color is = "+Color);
	}
}
class Price extends Colorbox{
	int price;
	void insert2(int p) {
		price=p;
	}
	void display2() {
		System.out.println("Enter the price"+price);
	}
}
public class MlevelBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h,w,d;
		String c;
		int p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the h,w,d,c,p");
		h=sc.nextDouble();
		w=sc.nextDouble();
		d=sc.nextDouble();
		c=sc.next();
		p=sc.nextInt();
		Price q=new Price();
		q.insert(h, w, d);
		q.calculate();
		q.display();
		q.insert1(c);
		q.display1();
		q.insert2(p);
		q.display2();
	}

}
