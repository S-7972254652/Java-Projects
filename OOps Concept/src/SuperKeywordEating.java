class Animal222{
	void eat() {System.out.println("Eating..");}
}
class dog899 extends Animal222{
	void eat() {System.out.println("Eating bread");	}
	void bark() {System.out.println("Barking..");}
	void work() {
		super.eat();
		bark();
	}
}
public class SuperKeywordEating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog899 d=new dog899();
		d.work();
	}

}
