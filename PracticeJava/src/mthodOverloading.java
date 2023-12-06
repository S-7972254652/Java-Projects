class Addition{
	void add(int a,int b){
		System.out.println(a+b);
	}
	void add(double a,double b) {
		System.out.println(a+b);
	}
}
public class mthodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		a.add(50.25, 50.25);
		a.add(5, 8);
	}

}
