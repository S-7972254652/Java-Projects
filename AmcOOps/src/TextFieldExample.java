import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFieldExample {

	public static void main(String[] args) {
		JFrame f=new JFrame("TextField Example");
		JTextField t1;
		t1=new JTextField("Welcome to JavaTpoint");
		t1.setBounds(50, 100, 200, 30);
		JTextField t2;
		t2=new JTextField("AWT Tutorials");
		t2.setBounds(150, 100, 200, 30);
		f.add(t1);f.add(t2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
