class V{
	void add() {
		int a=10,b=40;
		int c=a+b;
		System.out.println(c);
	}
	void add(int x,int y) {
		int c=x+y;
		System.out.println(c);
	}
	void add(int x,double y) {
		double c=x+y;
		System.out.println(c);
	}
}
public class MethodsOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
V c=new V();
c.add();
c.add(5,10);
c.add(5,55.5);
	}

}
