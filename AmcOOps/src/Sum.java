import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;

public class Sum {
Sum(){
	Frame f=new Frame();
	Label l1=new Label("First No");
	Label l2=new Label("Second No");
	Button b=new Button("Add");
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	l1.setBounds(20, 80, 80, 30);
	l2.setBounds(20, 100, 100, 50);
	t1.setBounds(190, 80, 80, 30);
	t2.setBounds(190, 120, 80, 30);
	t3.setBounds(190, 180, 80, 30);
	b.setBounds(15, 180, 80, 30);
	f.add(b);
	f.add(l1);
	f.add(l2);
	f.add(t1);
	f.add(t2);
	f.add(t3);
	f.setSize(400,300);
	f.setTitle("Addition");
	f.setLayout(null);
	f.setVisible(true);
}

	public static void main(String[] args) {
		Sum s=new Sum();

	}

}
