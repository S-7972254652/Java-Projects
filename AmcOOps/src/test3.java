import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;

public class test3 {
	test3(){
		Frame f=new Frame("Radio Buttons");
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox checkbox1=new Checkbox("C++",cbg,false);
		checkbox1.setBounds(100, 100, 50, 70);
		f.add(checkbox1);
		Checkbox checkbox2=new Checkbox("C",cbg,true);
		checkbox2.setBounds(150, 150, 50, 70);
		f.add(checkbox2);
		Checkbox checkbox3=new Checkbox("Java",cbg,false);
		checkbox3.setBounds(250, 250, 50, 70);
		f.add(checkbox3);
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new test3();
	}

}
