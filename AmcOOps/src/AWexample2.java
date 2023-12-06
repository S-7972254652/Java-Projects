import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class AWexample2 {
AWexample2(){
	Frame f=new Frame();
	Label l=new Label("Employee id");
	Button b=new Button("Submit");
	TextField t=new TextField();
	l.setBounds(20, 80, 80, 30);
	t.setBounds(20, 100, 80, 30);
	b.setBounds(100, 100, 80, 30);
	f.add(b);
	f.add(l);
	f.add(t);
	f.setSize(400,300);
	f.setTitle("Employee info");
	f.setLayout(null);
	f.setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AWexample2 aw=new AWexample2();
	}

}
