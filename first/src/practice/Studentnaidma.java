
package practice;
class Student{
	int rollno,standard;
	String name,division;
	void insert(int r,int std,String n,String div) {
		rollno=r;
		standard=std;
		name=n;
		division=div;
	}
	void display() {
		System.out.println(rollno+" "+standard+" "+name+" "+division);
	}
}
class marks extends Student{
	int mr;
	void insert1(int m) {
		mr=m;	
	}
	void display1() {
		System.out.println("Your marks is:"+mr);
	}
}
public class Studentnaidma {

	public static void main(String[] args) {
	
		marks ma=new marks();
		ma.insert(55, 3, "sagar", "A");
		ma.insert1(99);
		ma.display();
		ma.display1();

	}

}
