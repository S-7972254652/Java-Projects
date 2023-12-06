import java.util.Scanner;

class Triangle
{
	double area,base,height;
	static double half=0.5;
	 Triangle(double b,double h)
	{
		base=b;
		height=h;
	}
	void calculate()
	{
		area=0.5*base*height;
	}
	void display()
	{
		System.out.println("area="+area);
	}
}
public class AreaOfTriangleStaticKeyword {

	public static void main(String[] args) {
		double h;
		double b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		b=sc.nextDouble();
		System.out.println("Enter the height");
		h=sc.nextDouble();
		Triangle t=new Triangle(h,b);
		t.calculate();
		t.display();
	}

}
