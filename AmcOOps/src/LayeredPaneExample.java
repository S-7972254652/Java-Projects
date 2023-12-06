import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class LayeredPaneExample extends JFrame {
public LayeredPaneExample() {
	super("LayeredPaneExample");
	{
		setSize(200,200);
		JLayeredPane pane=getLayeredPane();
		JButton top=new JButton();
		top.setBackground(Color.ORANGE);
		top.setBounds(20,20,50,50);
		JButton middle=new JButton();
		middle.setBackground(Color.WHITE);
		middle.setBounds(40, 40, 50, 50);
		JButton bottom=new JButton();
		bottom.setBackground(Color.green);
		bottom.setBounds(60,60,50,50);
		pane.add(bottom,new Integer(1));
		pane.add(middle,new Integer(2));
		pane.add(top,new Integer(3));

	}
}
	public static void main(String[] args) {
		LayeredPaneExample panel=new LayeredPaneExample();
		panel.setVisible(true);
	}

}
