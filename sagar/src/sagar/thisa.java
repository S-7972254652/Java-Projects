package sagar;

class A{
	int a=20;
	void display() {
		int a=10;
		System.out.println("Local Variable="+a);
		System.out.println("Local Variable="+this.a);
	}
}
public class thisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.display();
	}

}
