interface i1{
	void show();
}
class Test implements i1{
	public void show() {
		System.out.println("It Shows Implements");
	}
}
public class interfacees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//i1 i= new i1();
		Test t1=new Test();
		t1.show();
	}

}
