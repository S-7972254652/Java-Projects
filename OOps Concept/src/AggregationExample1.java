class operation{
	int square(int n) {
		return n*n;
	}
}
class circle{
	operation op;
	double pi=3.14;
	double area(int radius) {
		op=new operation();
		int rsquare=op.square(radius);
		return pi*rsquare;
	}
}
public class AggregationExample1 {

	public static void main(String[] args) {
	circle c=new circle();
	double result=c.area(5);
	System.out.println(result);

	}

}
