class Student13{
	int id;
	String name;
	Student13(){
		System.out.println("default constructor is invoked");
	}
	Student13(int id,String name){
		this();
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	
}
public class invokedCurrentClassConstructorStudents {

	public static void main(String[] args) {
	Student13 e1=new Student13(111,"Karan");
	Student13 e2=new Student13(222,"akash");
	e1.display();
	e2.display();
	}

}
