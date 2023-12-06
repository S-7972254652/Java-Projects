import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class ScrollBarExample {
	ScrollBarExample(){
		JFrame f=new JFrame("ScrollBar Example");
		JScrollBar s=new JScrollBar();
		s.setBounds(100, 100, 50, 100);
		f.add(s);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ScrollBarExample();
	}

}
