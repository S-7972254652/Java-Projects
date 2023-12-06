class Sagar{
	void money(double a,int b) {
		
		System.out.println(a+b);
	}
	void money(int a,int b) {
		
		System.out.println(a+b+" Is My Dream Package ");
	}
}
public class MethodOverloadingSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sagar s=new Sagar();
s.money(2.5, 50);
s.money(10000, 50000);
	}

}
