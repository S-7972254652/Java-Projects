import java.util.Scanner;

interface salary{
	public void calculate();
}
class daily implements salary{
	Double payamount,workingDays;
	String name;
	void insert(String na,double wd) {
		name=na;
		workingDays=wd;
	}
	public void calculate() {
		payamount=workingDays*500;
	}
	void display() {
		System.out.println("payamount"+payamount);
	}
}
class month implements salary{
	double  workingDays,payamount,salary;
	String name;
	void insert(String na,double wd,double sl) {
		name=na;
		workingDays=wd;
		salary sl;
	}
	public void calculate() {
		payamount=salary/30*workingdays;
	}
	void display() {
		System.out.println("payamount"+payamount);
	}}

public class SalaryInterfaces {

	public static void main(String[] args) {
	double wd,sl;
	String na;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name,salary and workin days");
	na=sc.next();
	sl=sc.nextDouble();
	wd=sc.nextDouble();
	salary s=new month();
	s.insert(na,sl,wd);
	s.calculate();
	s.display();
	}

}
