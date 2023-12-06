 class Employee2{
	 float salary=40000;
 }
 class Programmer extends Employee2{
	 int bonus=10000;
 }
public class InheritanceEmployeeProgram {

	public static void main(String[] args) {
	Programmer p=new Programmer();
	System.out.println("Programmer Salary is:"+p.salary);
	System.out.println("Bonus of programmer is:"+p.bonus);

	}
}

