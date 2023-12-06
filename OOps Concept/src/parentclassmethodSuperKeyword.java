class Animal888{
	Animal888(){System.out.println("Animal is Created");}
}
class Dog999 extends Animal888{
	Dog999(){
		super();
		System.out.println("Dog is created");
	}
}
public class parentclassmethodSuperKeyword {

	public static void main(String[] args) {
	Dog999 d=new Dog999();

	}

}
