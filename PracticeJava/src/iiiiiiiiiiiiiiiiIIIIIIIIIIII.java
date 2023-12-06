import java.util.Scanner;

class One{
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println("id is ="+id);
		System.out.println("name is = "+name);
	}
}
 class two extends One{
	 int roll;
	 void insert1(int r) {
		 roll=r;
	 }
	 void display1() {
		 System.out.println("Roll no is="+roll);
	 }
 }
public class iiiiiiiiiiiiiiiiIIIIIIIIIIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
String n;
int r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the id,name and roll");
i=sc.nextInt();
n=sc.next();
r=sc.nextInt();
two t=new two();
t.insert(i, n);
t.display();
t.insert1(r);
t.display1();
	}

}
