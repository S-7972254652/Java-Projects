class Sum{
	void add(int a,int b) {
		System.out.println("Here Integer is taken");
	}
	void add(double a,double b) {
		System.out.println("Here Double is taken");	
	}
}
public class mOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sum s=new Sum();
s.add(.8, 4.5000);
s.add(5, 80);
	}

}
