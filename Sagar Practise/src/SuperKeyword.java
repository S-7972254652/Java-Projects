class Animal{
	Animal(){
		int a=78;
		System.out.println("Animal is created");
	}
}
class Dog extends Animal{
	int a=57;
	Dog(){
		super();
		System.out.println("Dog is Created..");
		System.out.println(a);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
	}

}
