import java.util.Scanner;

class Circle8{
	double area,radius,pi;
	void input(double r) {
		radius=r;
	}
	void calcarea()
	{
	area=3.14*radius*radius;	
	}
	void displayCircle8()
	{
		System.out.println("Area="+area);
	}
}
public class AreaOfCircleInstance {

	public static void main(String[] args) {
		Circle8 c=new Circle8();
		double r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=sc.nextDouble();
		c.input(r);
		c.calcarea();
		c.displayCircle8();

	}

}
