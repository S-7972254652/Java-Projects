import java.awt.Choice;
import java.awt.Frame;

public class test6 {
	test6(){
		Frame f=new Frame("Choose one Course");
		Choice c=new Choice();
		c.setBounds(100, 100, 85, 75);
		c.add("C");
		c.add("C++");
		c.add("Java");
		c.add("HTML");
		c.add("CSS3");
		c.add("JS");
		c.add("Bootstrap5");
		f.add(c);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
	new test6();

	}

}
