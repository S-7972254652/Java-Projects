import java.util.Scanner;

class Box154{
	int height, width, depth, volume;

	void insert(int h, int w, int d) {
		height = h;
		width = w;
		depth = d;
	}
	void calculate() {
		volume=height*width*depth;
	}
	void display() {
		System.out.println("Volume of Box is="+volume);
	}
}
class Colorbox extends Box154
{
String color;
void insert1(String c) {
	color=c;
} 
void display1() {
	System.out.println("Your Color Is = "+color);
}
}
class Price extends Colorbox{
	int Amount;
	void insert2(int am) {
		Amount=am;
	}
	void display2() {
		System.out.println("Enter the amount = "+Amount);
	}
}

public class Muktilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,w,d,am;
		String c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height,Wdth,Depth,Amount and color");
		h=sc.nextInt();
		w=sc.nextInt();
		d=sc.nextInt();
		am=sc.nextInt();
		c=sc.next();
		Price p=new Price();
		p.insert(h, w, d);
		p.display();
		p.insert1(c);
		p.display1();
		p.insert2(am);
		p.display2();
				
		
	}

}
