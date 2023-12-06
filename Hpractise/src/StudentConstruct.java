class Student5010{
	int roll;
	String name;
	int point;
	Student5010(int r,String n,int p){
		roll=r;
		name=n;
		point=p;
		
	}
	void display() {
		System.out.println("Enter the roll no"+roll);
		System.out.println("Enter the name"+name);
		System.out.println("Enter the point"+point);
	}
}
public class StudentConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student5010 s=new Student5010(55,"sagar",99);
s.display();
	}

}
