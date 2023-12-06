import java.util.Scanner;

class Trapezium
{
	double base1,base2,height,area;
	static double half=0.5;
	Trapezium(double b1,double b2,double h)
	{
		base1=b1;
		base2=b2;
		height=h;
	}
	void calculate()
	{
		area=0.5*height*(base1+base2);
	}
	void display()
	{
		System.out.println("area="+area);
	}
}

public class AreaOfTrapezium {

	public static void main(String[] args) {
		double b1;
		double b2;
		double h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base1");
		b1=sc.nextDouble();
		System.out.println("Enter the base2");
		b2=sc.nextDouble();
		System.out.println("Enter the height");
		h=sc.nextDouble();
		Trapezium t=new Trapezium(b1,b2,h);
		t.calculate();
		t.display();
	}

}
