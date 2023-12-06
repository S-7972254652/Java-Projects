interface Abc{
	void show();
}
class S implements Abc{
	public void show() {
		System.out.println("Aaa");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abc d=new S();
d.show();
	}

}
