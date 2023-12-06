import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;  
	private String name;  
	private List<Answer> answers;  
	  
	//setters and getters  
	  
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:");  
	    Iterator<Answer> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
	  
}
