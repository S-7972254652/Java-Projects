abstract class Splender{
	abstract void start();
}
class Hero extends Splender{
	void start() {
		System.out.println("Hero Honda Start");
	}
}
public class Vheicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Splender sp=new Splender();
		Hero h=new Hero();
		h.start();
	}

}
