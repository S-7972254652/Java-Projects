import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneExample3 extends WindowAdapter {
JFrame f;
OptionPaneExample3(){
	f=new JFrame();
	f.addWindowListener(this);
	f.setSize(300,300);
	f.setLayout(null);
	f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	f.setVisible(true);
}
public void windowClosing(WindowEvent e) {
	int a=JOptionPane.showConfirmDialog(f,"Are You Sure?");
	if(a==JOptionPane.YES_OPTION) {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new OptionPaneExample3();
	}

}
