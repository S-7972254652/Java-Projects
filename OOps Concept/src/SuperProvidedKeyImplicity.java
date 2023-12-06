class animal111{
	animal111(){System.out.println("Animal is created");}
}
class dog222 extends animal111{
	dog222(){
		System.out.println("Dog is Created");
	}
}
public class SuperProvidedKeyImplicity {

	public static void main(String[] args) {
		dog222 d=new dog222();

	}

}
