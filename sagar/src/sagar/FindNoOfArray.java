package sagar;
class Sagar{
	void code() {
		System.out.println("Coding is Simple");
	}
}
class Frontend extends Sagar{
	void code() {
		System.out.println("Frontend Developement..");
	}
}
public class FindNoOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sagar s=new Frontend();
		s.code();
	}

}
