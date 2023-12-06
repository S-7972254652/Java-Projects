class Boy{
	void Play() {
		System.out.println("Boys are playing");
	}
}
class Girl extends Boy{
	void play() {
super.Play();		
		System.out.println("Girls are playing");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Girl g=new Girl();
g.play();
	}

}
