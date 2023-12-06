import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CheclBoxExample3 {
JLabel l;
JCheckBox cb1,cb2,cb3;
JButton b;
CheclBoxExample3(){
	l=new JLabel("Food Ordering System");
	l.setBounds(50, 50, 300, 20);
	cb1=new JCheckBox("Pizza @ 100");
	cb1.setBounds(100, 100, 150, 20);
	cb2=new JCheckBox("Burger @ 100");
	cb2.setBounds(100, 150, 150, 20);
	cb3=new JCheckBox("Tea @ 10");
	cb3.setBounds(100, 150, 150, 20);
	b=new JButton("order");
	b.setBounds(100, 250, 150, 30);
    b.addActionListener(this); 
	add(l);add(cb1);add(cb2);add(b);
	setSize(400,400);
	setLayout(null);
	setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);  
	
}
public void actionPerformed(ActionEvent e){  
    float amount=0;  
    String msg="";  
    if(cb1.isSelected()){  
        amount+=100;  
        msg="Pizza: 100\n";  
    }  
    if(cb2.isSelected()){  
        amount+=30;  
        msg+="Burger: 30\n";  
    }  
    if(cb3.isSelected()){  
        amount+=10;  
        msg+="Tea: 10\n";  
    }  
    msg+="-----------------\n";  
    JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
