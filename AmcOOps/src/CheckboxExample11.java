import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;

public class CheckboxExample11 {
	CheckboxExample11(){
		Frame f=new Frame("Checkbox Example");
		Checkbox checkbox=new Checkbox("C++");
		checkbox.setBounds(100, 100, 50, 20);
		Checkbox checkbox2=new Checkbox("Java");
		checkbox2.setBounds(150, 100, 50, 20);
		Label l=new Label("You Select C++");
		l.setBounds(100, 1000,50, 40);
		f.add(checkbox);
		f.add(checkbox2);
		f.add(l);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckboxExample11();

	}

}
