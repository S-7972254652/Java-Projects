
public class Emp {
	private int id;  
	private String name;  
	private Add address;  
	public Emp() {}  
	  
	public Emp(int id, String name) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	}  
	public Emp(int id, String name, Add address) {  
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
