import java.awt.Checkbox;
import java.awt.Frame;

public class test2 {
test2(){
	Frame f=new Frame("Self Try Checkbox");
	Checkbox checkbox1=new Checkbox("Nashik",true);
	checkbox1.setBounds(100, 100, 80, 40);
	f.add(checkbox1);
	Checkbox checkbox2=new Checkbox("Pune");
	checkbox2.setBounds(150, 150, 80, 40);
	f.add(checkbox2);
	Checkbox checkbox3=new Checkbox("Mumbai");
	checkbox3.setBounds(200, 200, 80, 40);
	f.add(checkbox3);
	Checkbox checkbox4=new Checkbox("Delhi");
	checkbox4.setBounds(250, 250, 80, 40);
	f.add(checkbox4);
	f.setLayout(null);
	f.setSize(500,500);
	f.setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new test2();
	}

}
