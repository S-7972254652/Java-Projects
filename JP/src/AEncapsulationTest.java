class Employee{
	private int empid;
	public void setEmpid(int eid) {
		empid=eid;
	}
	public int getEmpid() {
		return empid;
	}
	
	
}
public class AEncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e=new Employee();
e.setEmpid(101);
System.out.println(e.getEmpid());
	}

}
