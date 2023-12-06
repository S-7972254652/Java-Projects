class student{
	int rollno;
	String name;
	void insertRecord(int r,String n) {
		rollno=r;
		name=n;
	}
	void displayInformation()
	{
		System.out.println(rollno+" "+name);
	}
	public void displayInformation() {
		
		
	}
}
public class InstanceMethidStudent {

	public static void main(String[] args) {
	student s1=new student();
	student s2=new student();
	s1.insertRecord(111, "Karan");
	s2.insertRecord(222, "aryan");
	s1.displayInformation();
	s2.displayInformation();

	}

}
