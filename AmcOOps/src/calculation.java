import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculation implements ActionListener {
	//creating the frame and components
	Frame f=new Frame();
	Label l1=new Label("First No");
	Label l2=new Label("Second No");
	Label l3=new Label("Result");

	//textField to take input
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();

	//Button to perform task
	Button b=new Button("Add");
	Button b1=new Button("Sub");
	Button b2=new Button("Multi");
	Button b3=new Button("Div");
	
	calculation(){
		l1.setBounds(50, 100, 100, 20);
		l2.setBounds(50, 140, 100, 20);
		l3.setBounds(50, 180, 100, 20);
		
		
		t1.setBounds(200, 100, 100, 20);
		t2.setBounds(200, 140, 100, 20);
		t3.setBounds(200, 180, 50, 20);
		
		
		b.setBounds(50, 250, 50, 20);
		b1.setBounds(110, 250, 50, 20);
		b2.setBounds(170, 250, 50, 20);
		b3.setBounds(230, 250, 50, 20);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.add(b);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,350);
		f.setLocation(500,200);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	int n1=Integer.parseInt(t1.getText());
	int n2=Integer.parseInt(t2.getText());
	if(e.getSource()==b) {
		t3.setText(String.valueOf(n1+n2));
	}
	if(e.getSource()==b1) {
		t3.setText(String.valueOf(n1-n2));
	}
	if(e.getSource()==b2) {
		t3.setText(String.valueOf(n1*n2));
	}
	if(e.getSource()==b3) {
		t3.setText(String.valueOf(n1/n2));
	}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new calculation();
	}

}
