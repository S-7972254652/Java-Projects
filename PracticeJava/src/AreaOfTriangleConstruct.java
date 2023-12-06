import java.util.Scanner;

class Triangle{
	double base,height,area;
	Triangle(double b,double h){
		base=b;
		height=h;
	}
	void calculate() {
		area=0.5*base*height;
	}
	void display() {
		System.out.println("Area is="+area);
	}
}
public class AreaOfTriangleConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t=new Triangle(15,20);
		t.calculate();
		t.display();
		

	}

}
