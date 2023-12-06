class D{
	void display() {
		System.out.println("D is letter in alphabets");
	}
}
class E extends D{
	void display() {
		System.out.println("E for Elephant");
		super.display();
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
E e=new E();
e.display();
	}

}
