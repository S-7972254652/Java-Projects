class Over{
	void add(int a,int b) {System.out.println(a+b);}
	void add(double a,int b) {System.out.println(a+b);}

}
public class OverloadingCalculation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over ov=new Over();
		ov.add(20, 30);
		ov.add(20.5, 3);

	}

}
