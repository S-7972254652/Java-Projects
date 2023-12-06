class Animal{
	void eat() {
		System.out.println("Eating&&&&......");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking$$$$$......");
	}
}
class Babydog9985 extends Animal{
	void wheep() {
		System.out.println("Wheeping............");
	}
}
public class HierachcalInheritanceAnimalDogBabyDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Babydog9985 bd=new Babydog9985();
bd.eat();
bd.wheep();
	}

}
