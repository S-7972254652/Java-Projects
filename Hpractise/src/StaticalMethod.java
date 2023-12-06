class Student9981{
	int id;
	String name;
	static String college="Engineering college";
	Student9981(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
}
public class StaticalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student9981 s=new Student9981(55,"sagar");
s.display();
	}

}
