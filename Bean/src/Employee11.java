
public class Employee11 {
	private int id;  
	private String name;  
	private Address address;  
	public Employee11() {}  
	  
	public Employee11(int id, String name) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	}  
	public Employee11(int id, String name, Address address) {  
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
