package jdbcconnect1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StudentRegistration {
	JFrame f=new JFrame("Student Registration");
	
	JLabel l1=new JLabel("Name");
	JLabel l2=new JLabel("Address");
	JLabel l3=new JLabel("Qualification");
	JLabel l4=new JLabel("DOB");
	JLabel l5=new JLabel("Password");
	JLabel l6=new JLabel("Confirm Password");
	
	JTextField t1=new JTextField();
	JPasswordField value = new JPasswordField();
	 JPasswordField value1 = new JPasswordField();   
	JTextField t4=new JTextField();
	JTextField t5=new JTextField();
	
	JButton b=new JButton("Register");
	
	StudentRegistration(){
		l1.setBounds(50, 100, 100, 30);     
	    l2.setBounds(50, 150, 100, 30);
	    l3.setBounds(50, 200, 100, 30);
	    l4.setBounds(50, 250, 100, 30);
	    l5.setBounds(50, 300, 100, 30);
	    l6.setBounds(50, 350, 100, 30);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
