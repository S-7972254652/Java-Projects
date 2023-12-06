import java.util.Scanner;

class Circle4{
double area,radius,pi;
void insertRecord(double r) {
	radius=r;
	pi=3.14;
}
void calculateInformation()
{
	area=3.14*radius*radius;
}
void displayInformation()
{
	System.out.println("Area="+area);
}
}
public class ObjectAreaOfCircle {

	public static void main(String[] args) {
		Circle4 c=new Circle4();
		double r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=sc.nextDouble();
		c.insertRecord(r);
		c.calculateInformation();
		c.displayInformation();
		
	}

}
