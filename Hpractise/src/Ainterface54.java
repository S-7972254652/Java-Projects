interface Ac{
	void display();
}
class B12 implements Ac{
	public void display() {
		System.out.println("A");
	}
}
class C implements Ac{
	public void diaplay() {
		System.out.println("B");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
public class Ainterface54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ac a=new B12();
		a.display();
	}

}
