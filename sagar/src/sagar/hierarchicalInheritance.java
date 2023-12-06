package sagar;
class Animal2003{
	void eat() {
		System.out.println("Eating..");
	}
}
class Dog extends Animal2003{
	void Bark() {
		System.out.println("Barking..");
	}
}
class Cat extends Animal2003{
	void meow() {
		System.out.println("Meowing..");
	}
}
public class hierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.eat();
		//c.Bark();
		c.meow();
		
		
	}

}
