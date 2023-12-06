import java.util.Date;

public class Ans {
	private int id;  
	private String answer;  
	private Date postedDate;  
	public Ans() {}  
	public Ans(int id, String answer, Date postedDate) {  
	    super();  
	    this.id = id;  
	    this.answer = answer;  
	    this.postedDate = postedDate;  
	}  
	  
	public String toString(){  
	    return "Id:"+id+" Answer:"+answer+" Posted Date:"+postedDate;  
	}  
}
