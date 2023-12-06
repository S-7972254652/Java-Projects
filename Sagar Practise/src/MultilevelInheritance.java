import java.util.Scanner;

class Box{
	int height,width,depth,volume;
	void insert(int h,int w,int d) {
		height=h;
		width=w;
		depth=d;
	}
	void calculate() {
		volume=height*width*depth;
	}
	void display() {
		System.out.println("Volume is="+volume);
	}
}
class colorBox extends Box{
	String color;
	void insert1(String c) {
		color=c;
	}
	void display1() {
		System.out.println("Color is="+color);
	}
}
class Price extends colorBox{
	int Amount;
	void insert2(int A) {
		Amount=A;
	}
	void display2() {
		System.out.println("Amount is="+Amount);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,w,d,A;
		String c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height,width,depth,color and Amount");
		h=sc.nextInt();
		w=sc.nextInt();
		d=sc.nextInt();
		A=sc.nextInt();
		c=sc.next();
		Price p=new Price();
		p.insert(h, w, d);
		p.calculate();
		p.display();
		p.insert1(c);
		p.display1();
		p.insert2(A);
		p.display2();
		
	}

}
