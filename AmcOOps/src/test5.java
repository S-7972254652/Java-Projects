import java.awt.Choice;
import java.awt.Frame;

public class test5 {
	test5(){
		Frame f=new Frame("Select Your Choice");
		Choice c=new Choice();
		c.setBounds(100, 100, 75, 75);
		c.add("Nashik");
		c.add("Pune");
		c.add("Mumbai");
		c.add("Hydrabas");
		f.add(c);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new test5();
	}

}
