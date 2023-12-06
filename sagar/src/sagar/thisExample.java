package sagar;
class ABCD{
	int a=20;//Golbal Variable
	void display() {
		int a=40;//Local Varriable
		System.out.println("Local Variable="+a);
		System.out.println(this.a);
	}
}
public class thisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABCD a=new ABCD();
		a.display();
	}

}
