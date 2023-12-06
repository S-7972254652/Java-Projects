class Student22{
	int rollno;
	int Class;
	String name,division;
	void insert(int r,int C,String n,String d )
	{
		rollno=r;
		Class=C;
		name=n;
		division=d;
	}
	void display() {
		System.out.println(rollno+" "+Class+" "+name+" "+division);
	}
}	
	class Marks extends Student22{
		int mr;
		void insert1(int m){
			mr=m;
		}
		void display1() {
			System.out.println("marks="+mr);
		}
	}
public class StudentInheritence {

	public static void main(String[] args) {
		int no,c,m;
		String n,d;
		Marks ma=new Marks();
		ma.insert(11,6,"Rajesh","A");
		ma.insert1(12);
		ma.display();
		ma.display1();
	}

}
