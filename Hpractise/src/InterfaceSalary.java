interface Salary{
	void insert();
	void insert(double ms, double wd);
	void calculate();
	void display();
}
class Monthly implements Salary{
	double workingDays=30,monthlySalary;
	double dailySalary=200;
	public void insert(double wd,double ms) {
		workingDays=wd;
		monthlySalary=ms;
	}

	public void calculate() {
		monthlySalary=dailySalary*workingDays;
	}
	public void display() {
	System.out.println("The monthly salary is = "+monthlySalary);	
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}
	
}
class daily implements Salary{
double monthlySalary,dailySalary,workingDays;

	@Override
	public void insert(double ms,double wd) {
		monthlySalary=ms;
		workingDays=wd;	
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		dailySalary=monthlySalary/workingDays;
	}

	@Override
	public void display() {
		System.out.println("The Daily Salary is = "+dailySalary);
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Salary s=new Monthly();
s.insert();
s.calculate();
s.display();
Salary s1=new daily();
s1.insert();
s1.calculate();
s1.display();
	}

}
