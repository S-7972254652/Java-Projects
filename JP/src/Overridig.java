class o{
	void shape() {
		System.out.println("Shape is drawn");
	}
}
class p extends o{
	void shape() {
		System.out.println("Cant draw");
	}
}
public class Overridig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
o O=new p();
O.shape();
	}

}
