interface Animal{
	void eat();
}
class Dog implements Animal{
	public void eat() {
		System.out.println("Eating...");
	}
}
class Cat implements Animal{
	public void eat() {
		System.out.println("Bark");
	}
}
public class interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a=new Dog();
a.eat();
Animal a1=new Cat();
a1.eat();
	}

}
