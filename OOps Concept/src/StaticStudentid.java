
class Student
{
	int id;
	String name;
	static String cname="its";
	Student(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("College Name="+cname);
	}
}

	public class StaticStudentid {
	public static void main(String[] args) {
		Student s=new Student(1,"Esha");
		Student s1=new Student(2,"Rudra");
		s.display();
		s1.display();
		}
	}

