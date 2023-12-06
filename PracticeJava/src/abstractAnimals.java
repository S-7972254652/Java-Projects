abstract class Animal{
	abstract void eat();
}
class Dog745 extends Animal{
	void eat() {
		System.out.println("Eat Pedigree");
	}
}
class Cat547 extends Dog745{
	void eat() {
		System.out.println("Eating Mouse");
	}
}
public class abstractAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a=new Dog745();
a.eat();
Animal a1=new Cat547();
a1.eat();
	}

}
