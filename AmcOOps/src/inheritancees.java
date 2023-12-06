import java.util.Scanner;

class Students{
	int rollno;
	int standard;
	String name,division;
	void insert(int r,int std,String n,String div) {
		rollno=r;
		standard=std;
		name=n;
		division=div;
	}
	void display() {
		System.out.println(rollno+""+standard+""+name+" "+division);
	}
}
class Mark extends Students{
	int marks;
	void insert(int m) {
		marks=m;
	}
	void display() {
		System.out.println("Enter the marks"+marks);
	}
}
public class inheritancees {

	public static void main(String[] args) {
		int r,std,m;
		String n,div;
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		std=sc.nextInt();
		m=sc.nextInt();
		n=sc.next();
		div=sc.next();
		Mark m1=new Mark();
		m1.insert(r, std, n, div);
		m1.display();
		m1.insert(m);
		m1.display();
	}

}
