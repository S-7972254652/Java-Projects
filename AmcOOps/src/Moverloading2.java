class Addition{
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b,double c) {
		return a+b+c;
	}
}
public class Moverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Addition.add(50, 450));
System.out.println(Addition.add(4.5, 2.5, 2.5));
	}

}
