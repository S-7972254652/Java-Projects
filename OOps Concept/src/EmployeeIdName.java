class Employee
{
int id;
String name;
static String cname="itech";
Employee (int i,String n)
{
	id=i;
	name=n;
}
void display()
{
	System.out.println("ID="+id);
	System.out.println("Name="+name);
	System.out.println("Company name="+cname);
}
}
public class EmployeeIdName {
	public static void main(String[] args) {
	Employee e=new Employee(45,"Esha");
	Employee e1=new Employee(55,"Rohan");
	e.display();
	e1.display();
	}

}
