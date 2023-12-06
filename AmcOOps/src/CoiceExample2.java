import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoiceExample2 {
	CoiceExample2(){
		Frame f=new Frame();
		final Label label=new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400,400);
		Button b=new Button("Show");
		b.setBounds(100, 100, 75, 75);
		 final Choice c = new Choice(); 
		 c.setBounds(100, 100, 75, 75);
		c.add("c");
		c.add("c++");
		c.add("JAVA");
		c.add("Python");
		c.add("Android");
		f.add(c);
		f.add(label);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data="Programing language Selected"+c.getItem(c.getSelectedIndex());
				label.setText(data);
			}
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new CoiceExample2();
	}

}
