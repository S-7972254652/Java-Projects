import java.util.Scanner;

class Triangle4{
	double base,height,area;
	void input(double b,double h) {
		base=b;
		height=h;
	}
	void calcarea()
	{
		area=0.5*base*height;
	}
	void displayTriangle4()
	{
		System.out.println("Area="+area);
	}
}
public class AreaofTriangleInstance {

	public static void main(String[] args) {
		Triangle4 t=new Triangle4();
		int h,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of base");
		b=sc.nextInt();
		System.out.println("Enter the value of height");
		h=sc.nextInt();
		t.input(b, h);
		t.calcarea();
		t.displayTriangle4();
		}

}
