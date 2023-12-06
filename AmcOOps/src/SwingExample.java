import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame f=new JFrame();
JButton b=new JButton("Click");
b.setBounds(130,100,100,40);
f.add(b);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
	}

}
