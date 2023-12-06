
public class Employee6 {
	private int id;  
	private String name;  
	private Address address;  
	public Employee6() {}  
	  
	public Employee6(int id, String name) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	}  
	public Employee6(int id, String name, Address address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	void show(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}  
}
