import java.awt.Checkbox;
import java.awt.Frame;

public class test1 {
	test1(){
		Frame f=new Frame("Check box example");
		Checkbox checkbox1=new Checkbox("C",true);
		checkbox1.setBounds(100, 100, 70, 20);
		f.add(checkbox1);
		Checkbox checkbox2=new Checkbox("C++");
		checkbox2.setBounds(150, 150, 70, 20);
		f.add(checkbox2);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new test1();
	}

}
