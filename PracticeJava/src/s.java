class Cat{
	void meow() {
		System.out.println("Meow...");
	}
}
class Doggy extends Cat{
	void display() {
		System.out.println("Cat is friend of dog");
	super.meow();	
	}
}
public class s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Doggy d=new Doggy();
d.meow();
//d.display();
	}

}
