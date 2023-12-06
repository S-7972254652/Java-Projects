import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;

public class test4 {
	test4(){
		Frame f=new Frame("Self Radio Button");
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox checkbox1=new Checkbox("Nashik",cbg,true);
		checkbox1.setBounds(100, 100, 50, 30);
		f.add(checkbox1);
		Checkbox checkbox2=new Checkbox("Pune",cbg,false);
		checkbox2.setBounds(150, 150, 100, 30);
		f.add(checkbox2);
		Checkbox checkbox3=new Checkbox("Mumbai",cbg,false);
		checkbox3.setBounds(200, 200, 50, 30);
		f.add(checkbox3);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,500);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new test4();
	}

}
