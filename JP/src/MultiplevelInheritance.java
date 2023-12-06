class PM{
	void Order() {
		System.out.println("Prime Minister Order To Chief Minister");
	}
}
class CM extends PM{
	void Order1() {
		System.out.println("CM is Order To MLA");
		}
	}
class MLA extends CM{
	void Order2() {
		System.out.println("MLA Follow Orders");
	}
}

public class MultiplevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MLA m=new MLA();
m.Order();
m.Order1();
m.Order2();
	}

}
