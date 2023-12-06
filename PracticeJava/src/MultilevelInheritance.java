class Animal{
	void eat() {
		System.out.println("Eatting.....");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking..");
	}
}
class BabyDog extends Dog{
	void wheeping() {
		System.out.println("wheeping....");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BabyDog g=new BabyDog();
g.eat();
g.wheeping();
g.bark();
	}

}
