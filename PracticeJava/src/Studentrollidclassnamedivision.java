import java.util.Scanner;

class Student{
	int rollno,Class;
	String name,division;
	void insert(int r,int C,String n,String d ) {
		rollno=r;
		Class=C;
		name=n;
		division=d;
	}
	void display() {
		System.out.println("Your roll no is:"+rollno+" "+"Your class is:"+Class+" "+"Enter the name "+name+"Enter the div "+division);
	}
}
class Marks extends Student{
	int markss;
	void insert1(int mr) {
		markss=mr;
	}
	void display1() {
		System.out.println(markss);
	}
	
}
public class Studentrollidclassnamedivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,C;
		String n,d;
		int mr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll no,class,name & division marks");
		r=sc.nextInt();
		C=sc.nextInt();
		n=sc.next();
		d=sc.next();
		mr=sc.nextInt();
		Marks m=new Marks();
		m.insert(r, C, n, d);
		m.display();
		m.insert1(mr);
		m.display1();
	}

}
