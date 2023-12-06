package sagar;
class ABC{
	int a=40;
	void display() {
		System.out.println("ABC is a Base Class");
	}
}
class DEF extends ABC{
	int a=60;
	void display() {
		System.out.println("DEF is a Derived class");
		System.out.println(super.a);
	}
}
public class SuperKeywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DEF d=new DEF();
		d.display();
	
	}

}
