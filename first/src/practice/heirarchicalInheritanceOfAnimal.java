package practice;
class tiger{
	void bhoot() {
		System.out.println("Bhooo...");
	}
}
class Lion extends tiger{
	void hehe() {
		System.out.println("hhhhhh....");
	}
}
class Elephant extends tiger{
	void chi() {
		System.out.println("Yeh...");
	}
}
public class heirarchicalInheritanceOfAnimal {

	public static void main(String[] args) {
	Elephant e=new Elephant();
	e.chi();
	e.bhoot();

	}

}
