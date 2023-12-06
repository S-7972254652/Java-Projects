import java.awt.Component;
import java.awt.Frame;
import java.util.List;

public class ListExample1 {
	ListExample1(){
		Frame f=new Frame();
		List l1=new List(5);
	     l1.setBounds(100, 100, 75, 75);   
		l1.add("item1");
		l1.add("item2");
		l1.add("item3");
		l1.add("item4");
		l1.add("item5");
		f.add((Component) l1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ListExample1();
	}

}
