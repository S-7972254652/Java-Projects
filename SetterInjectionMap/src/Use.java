
public class Use {
	private int id;  
	private String name,email;  
	public Use() {}  
	public Use(int id, String name, String email) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.email = email;  
	}  
	  
	public String toString(){  
	    return "Id:"+id+" Name:"+name+" Email Id:"+email;  
	}  
}
