class City{
	String city,state;
	City(String city,String state){
		this.city=city;
		this.state=state;
	}
	void display() {
		System.out.println("Your City is="+city);
		System.out.println("Your State is="+state);

	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
City c=new City("Nashik","Maharashtra");
City c1=new City("Delhi","Delhi");
c.display();
c1.display();
	}

}
