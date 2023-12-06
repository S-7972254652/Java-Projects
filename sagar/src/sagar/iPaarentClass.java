package sagar;
class prani{
	String Catcolor="Black";
}
class kutra extends prani{
	String Catcolor="Brown";
	void display() {
		System.out.println("The child class cat color is="+Catcolor);
		System.out.println("The parent class dog color is="+super.Catcolor);
	}
}
public class iPaarentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kutra d=new kutra();
		d.display();
	}

}
