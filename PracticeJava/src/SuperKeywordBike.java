class A99{
	int maxSpeed=200;
	void speed(){
		System.out.println("Drive With Safe Speed 60KMPH");
	}
}
class B extends A99{
	int maxspeed=400;
	void speed() {
		System.out.println("Drive  with 20KMPH");
		System.out.println(super.maxSpeed);
		super.speed();
	}
}
public class SuperKeywordBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new B();
b.speed();
	}

}
