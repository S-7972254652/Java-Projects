class Emp{
	private int Emp_id;
	
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public int getEmp_id() {
		return Emp_id;
	}
	
}
public class Encap {

	public static void main(String[] args) {
		Emp e=new Emp();
		e.setEmp_id(101);
		System.out.println(e.getEmp_id());

	}

}
