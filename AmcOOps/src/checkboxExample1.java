import java.awt.Checkbox;
import java.awt.Frame;

public class checkboxExample1 {
	checkboxExample1(){
		Frame f=new Frame("Checkbox Example1");
		Checkbox checkbox1=new Checkbox("C++");
		checkbox1.setBounds(100, 100, 50, 50);
		Checkbox checkbox2=new Checkbox("C++");
		checkbox2.setBounds(100, 150, 50, 50);
		f.add(checkbox1);
		f.add(checkbox2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new checkboxExample1();
	}

}
