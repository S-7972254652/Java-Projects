class Animals{
	void sound() {
		System.out.println("The Animals make Different Sounds");
	}
}
class Dog extends Animals{
	void sound() {
		System.out.println("The Dog Is Barking..");
	}
}
class Cat extends Animals{
	void sound(){
		System.out.println("Meow..");
	}
}
public class PolyMorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animals a=new Animals();
Dog d=new Dog();
Cat c=new Cat();
a.sound();
d.sound();
c.sound();

	}

}
