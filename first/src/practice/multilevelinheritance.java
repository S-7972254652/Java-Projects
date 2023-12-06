package practice;
class Animal{
	void eat() {
		System.out.println("Eating..");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking..");
	}
}
class Babydog extends Dog{
	void weep(){
		System.out.println("Weeping");
	}
}
public class multilevelinheritance {

	public static void main(String[] args) {
		Babydog d=new Babydog();
		d.weep();
		d.bark();
		d.eat();

	}

}
