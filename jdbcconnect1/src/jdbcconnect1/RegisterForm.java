package jdbcconnect1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterForm implements ActionListener  {
	JFrame f=new JFrame("Menu and MenuItem Example");
	
	JLabel l1=new JLabel("User Registration");
	JLabel l2=new JLabel("User Name");
	JLabel l3=new JLabel("Password");
	JLabel l4=new JLabel("Confirm Password");
	JLabel l5=new JLabel("Email ID");
	JLabel l6=new JLabel("DOB");
	
	JTextField t1=new JTextField();
	JPasswordField value = new JPasswordField();
	 JPasswordField value1 = new JPasswordField();   
	JTextField t4=new JTextField();
	JTextField t5=new JTextField();

	JButton b=new JButton("Register");
	
	RegisterForm(){
		 	l1.setBounds(50, 100, 100, 30);     
		    l2.setBounds(50, 150, 100, 30);
		    l3.setBounds(50, 200, 100, 30);
		    l4.setBounds(50, 250, 100, 30);
		    l5.setBounds(50, 300, 100, 30);
		    l6.setBounds(50, 350, 100, 30);
		  
		    t1.setBounds(250, 150, 400, 30);
		    value.setBounds(250, 200, 400, 30);
		    value1.setBounds(250,250,400,30);   
		    t4.setBounds(250, 300, 400, 30);
		    t5.setBounds(250, 350, 400, 30);
		    
		    b.setBounds(250,450,100,30);
		    
		    f.add(l1);
		    f.add(l2);
		    f.add(l3);
		    f.add(l4);
		    f.add(l5);
		    f.add(l6);
		      
		    f.add(t1);
		    f.add(value);
		    f.add(value1);
		    f.add(t4);
		    f.add(t5);
		    
		    f.add(b);
		    
		    b.addActionListener(this);
		    
			f.setLayout(null);
			f.setVisible(true);
			f.setSize(1000,1000);
			f.setLocation(100,100);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		f.dispose();
		Menu m=new Menu();
		
		if(e.getSource()==b) {
			//int EmpID=Integer.parseInt(t1.getText());
			//String EmpName=t2.getText();
			//String EmpAddress=t3.getText();
			String UserName=t1.getText();
			int Password=Integer.parseInt(value.getText());
			int ConfirmPassword=Integer.parseInt(value1.getText());
			String EmailID=t4.getText();
			int DOB=Integer.parseInt(t5.getText());
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationform","root","");
				java.sql.Statement stmt=con.createStatement();
				int result=stmt.executeUpdate("INSERT INTO `usercustomer`( `UserName`, `Password`, `ConfirmPassword`, `Email`, `DOB`) VALUES ('"+UserName+"','"+Password+"','"+ConfirmPassword+"','"+EmailID+"','"+DOB+"')");
				JOptionPane.showMessageDialog(b, "Record inserted");
				ResultSet rs=stmt.executeQuery("Select * from usercustomer");
				while(rs.next())
					System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
				con.close();
			}
			catch(Exception exception){
				System.out.println(exception);
			}
			
			
		}
		
	}
	public static void main(String[] args) {
		new RegisterForm();
		}

}

