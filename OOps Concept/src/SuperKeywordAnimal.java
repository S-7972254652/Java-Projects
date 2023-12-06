class bird99{
	String color="white";
}
class Cat85 extends bird99{
	String color="black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperKeywordAnimal {

	public static void main(String[] args) {
	Cat85 d=new Cat85();
	d.printColor();

	}

}
