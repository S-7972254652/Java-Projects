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
		System.out.println("Voilume is = "+volume);
	}
}
class colorbox extends Box{
	String color;
	void insert1(String c) {
		color=c;
	}
	void display1() {
		System.out.println("Color is = "+color);
	}
}
class price extends colorbox{
	int price;
	void insert2(int p) {
		price=p;
	}
	void display2() {
		System.out.println("Price is = "+price);
	}
}
public class BoxPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int h,w,d,p;
String c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the height,width,depth,price and color");
h=sc.nextInt();
w=sc.nextInt();
d=sc.nextInt();
p=sc.nextInt();
c=sc.next();
price q=new price();
q.insert(h, w, d);
q.calculate();
q.display();
q.insert1(c);
q.display1();
q.insert2(p);
q.display2();
	}

}
