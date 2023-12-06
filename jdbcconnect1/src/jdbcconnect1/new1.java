package jdbcconnect1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class new1 implements ActionListener{
	JFrame f1=new JFrame("Log In");
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;

	new1()
	{
	l1=new JLabel("User Name");
	l2=new JLabel("Password");
	t1=new JTextField(20);
	t2=new JTextField(20);
	b1=new JButton("OK");

	f1.setSize(400,400);
	f1.setVisible(true);
	f1.setLayout(null);

	f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	f1.add(l1);
	f1.add(t1);
	f1.add(l2);
	f1.add(t2);
	f1.getContentPane().add(b1);

	l1.setBounds(0,30,100,30);
	t1.setBounds(110,30,100,30);
	l2.setBounds(0,70,100,30);
	t2.setBounds(110,70,100,30);
	b1.setBounds(0,120,100,30);

	b1.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		f1.dispose();
		Project1 p2=new Project1();
		
	}
	public static void main(String ag[])
	{
	new1 p1=new new1();
	}
	}
