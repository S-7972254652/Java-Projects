import java.util.Scanner;

class Circles
{
	double radius,area;
	void insert(double r) {
		radius=r;
	}
	void calculate() {
		area= (3.14*radius*radius);
	}
	void display() {
		System.out.println("Area="+area);
	}
}
public class ObjectAreaOfCircles {

	public static void main(String[] args) {
	Circles c=new Circles();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius");
	r=sc.nextDouble();
	r.display();
	}

}