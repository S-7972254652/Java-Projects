package sagar;
class X{
	int a=20;
	void display() {
		
	}
}
class Y extends X{
	int a=40;
	void display() {
		System.out.println(super.a);
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y r=new Y();
		r.display();
	}

}
