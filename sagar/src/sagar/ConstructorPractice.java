package sagar;

import java.util.Scanner;

class Student{
	int id;
	String name;
	Student(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class ConstructorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; 
		String n;
		Student s1=new Student(11,"Sagar");
		Student s2=new Student(12,"Vinayak");
		s1.display();
		s2.display();
	}

}
