class Animal103{
	void eat() {
		System.out.println("Eating..");
	}
}
class Dog98 extends Animal103{
	void bark() {
		System.out.println("Barking..");
	}
}
class Catl extends Dog98{
	void Cats() {
		System.out.println("Meow...");
	}
}
public class Minheritance {

	public static void main(String[] args) {
Catl a=new Catl();
a.eat();
	}

}
