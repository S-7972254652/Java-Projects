import java.awt.Frame;
import java.awt.Scrollbar;

public class test8 {
test8(){
	Frame f=new Frame();
	Scrollbar s=new Scrollbar();
	s.setBounds(100, 100, 200, 400);
	f.add(s);
	f.setLayout(null);
	f.setSize(500,500);
	f.setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new test8();
	}

}
