class Worker{
	int payment,id;
	String name;
	Worker(int pt,int i,String ne){
		payment=pt;
		id=i;
		name=ne;
	}
	void display() {
		System.out.println(" the Payment is="+payment);
		System.out.println("the id is="+id);
		System.out.println("the Name is="+name);
	}
}
public class Constructor5986 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Worker w=new Worker(15000,89,"Mahesh");
Worker w1=new Worker(18000,89,"Ganesh");
w.display();
w1.display();

	}

}
