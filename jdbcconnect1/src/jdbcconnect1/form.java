package jdbcconnect1;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class form  implements ActionListener {
	JFrame f=new JFrame();
	JLabel l1=new JLabel("EmpID");
	JLabel l2=new JLabel("EmpName");
	JLabel l3=new JLabel("EmpAddress");

	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();

	JButton b1=new JButton("Insert");
	JButton b2=new JButton("Update");
	JButton b3=new JButton("Delete");

	form(){
		l1.setBounds(50, 100, 100, 20);
		l2.setBounds(50, 140, 100, 20);
		l3.setBounds(50, 180, 100, 20);
		
		t1.setBounds(200, 100, 100, 20);
		t2.setBounds(200, 140, 100, 20);
		t3.setBounds(200, 180, 50, 20);
		
		
		b1.setBounds(110, 250, 100, 20);
		b2.setBounds(200, 250, 100, 20);
		b3.setBounds(300, 250, 100, 20);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,350);
		f.setLocation(500,200);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			//int EmpID=Integer.parseInt(t1.getText());
			String EmpName=t2.getText();
			String EmpAddress=t3.getText();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
				java.sql.Statement stmt=con.createStatement();
				int result=stmt.executeUpdate("INSERT INTO `empinfo`( `EmpName`, `EmpAddress`)" + "VALUES ('"+EmpName+"','"+EmpAddress+"')");
				JOptionPane.showMessageDialog(b1, "Record inserted");
				ResultSet rs=stmt.executeQuery("Select * from emp");
				while(rs.next())
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				con.close();
			}
			catch(Exception exception){
				System.out.println(exception);
			}
		}
		if(e.getSource()==b2) {
			int EmpID=Integer.parseInt(t1.getText());
			String EmpName=t2.getText();
			String EmpAddress=t3.getText();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
				java.sql.Statement stmt=con.createStatement();
				int result=stmt.executeUpdate("UPDATE `empinfo` SET `EmpName`='"+EmpName+"',`EmpAddress`='"+EmpAddress+"' WHERE EmpID='"+EmpID+"'");
				JOptionPane.showMessageDialog(b1, "Record Updated");
				ResultSet rs=stmt.executeQuery("Select * from emp");
				while(rs.next())
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				con.close();
			}
			catch(Exception exception){
				System.out.println(exception);
			}
		}
		if(e.getSource()==b3) {
			int EmpID=Integer.parseInt(t1.getText());
			String EmpName=t2.getText();
			String EmpAddress=t3.getText();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
				java.sql.Statement stmt=con.createStatement();
				int result=stmt.executeUpdate("DELETE FROM `empinfo` WHERE EmpId='"+EmpID+"'");
				JOptionPane.showMessageDialog(b1, "Record Deleted");
				ResultSet rs=stmt.executeQuery("Select * from emp");
				while(rs.next())
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				con.close();
			}
			catch(Exception exception){
				System.out.println(exception);
			}
		}
		
	}
	public static void main(String[] args) {
		new form();
	}

}
