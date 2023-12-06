import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {
Frame f=new Frame();
Label l1=new Label("First No");
Label l2=new Label("Second No");
Label l3=new Label("Result");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
Button b1=new Button("ADD");
calculator(){
	l1.setBounds(50, 100, 100, 20);
	l2.setBounds(50, 140, 100, 20);
	l3.setBounds(50, 180, 100, 20);
	t1.setBounds(200, 100, 100, 20);
	t2.setBounds(200, 140, 100, 20);
	t3.setBounds(200, 180, 100, 20);
	b1.setBounds(50, 250, 50, 20);
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(t1);
	f.add(t2);
	f.add(t3);
	f.add(b1);
b1.addActionListener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(400,350);
}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		if(e.getSource()==b1) {
			t3.setText(String.valueOf(n1+n2));
		}
		
	}
	public static void main(String[] args) {
		new calculator();
	}

}
