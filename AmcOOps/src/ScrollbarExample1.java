import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollbarExample1 {
	ScrollbarExample1(){
		Frame f=new Frame("Scrollbar Example");
		Scrollbar s=new Scrollbar();
		s.setBounds(100, 100, 50, 100);
		f.add(s);
		s.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ScrollbarExample1();
	}

}
