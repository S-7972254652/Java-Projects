package jdbcconnect1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu implements ActionListener{
	JFrame f= new JFrame("");  
	  JMenu menu, submenu;  
      JMenuItem i1, i2, i3; 
      Menu(){
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");    
          
          i1=new JMenuItem("User");  
          i2=new JMenuItem("Register");  
          i3=new JMenuItem("Show User");
          
          menu.add(i1);
          menu.add(i2);
          menu.add(i3); 
          
          mb.add(menu);  
          
          i2.addActionListener(this);
          
          f.setJMenuBar(mb);  
          f.setSize(1000,1000);  
          f.setLayout(null);  
          f.setVisible(true);  
          
      }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		f.dispose();
		RegisterForm f=new RegisterForm();
	}


public static void main(String[] args) {
	Menu m=new Menu();

}
}