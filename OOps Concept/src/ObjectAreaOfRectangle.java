class Rectangle
{
	int length,width;
	float area;
	void insert(int l,int w) {
		length=l;
		width=w;
	}
	void calculate() {
		area=length*width;
	}
	void display() {
		System.out.print("Area="+area);
	}
}
public class ObjectAreaOfRectangle {

	public static void main(String[] args) {
	Rectangle r=new Rectangle();
	r.insert(10, 20);
	r.calculate();
	r.display();
	}
}