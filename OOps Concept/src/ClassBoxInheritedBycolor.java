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
		System.out.println("Volume is:"+volume);
	}
}
class Colorbox extends Box{
	String c_color;
	void insert1(String c) {
		c_color=c;
	}
	void display1() {
		System.out.println("Color is:"+c_color);
	}
}
class Price extends Colorbox{
	int amount;
	void insert2(int a) {
		amount=a;
	}
	void display2() {
		System.out.println("Amount is"+amount);
	}
}
public class ClassBoxInheritedBycolor {

	public static void main(String[] args) {
	int h,w,d;
	String c;
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the height,width,depth,color and amount:");
	h=sc.nextInt();
	w=sc.nextInt();
	d=sc.nextInt();
	c=sc.next();
	a=sc.nextInt();
	Price p=new Price();
	p.insert(h, w, d);
	p.calculate();
	p.display();
	p.insert1(c);
	p.display1();
	p.insert2(a);
	p.display2();
	}

}
