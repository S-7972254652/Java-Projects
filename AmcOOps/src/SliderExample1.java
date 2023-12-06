import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SliderExample1 extends JFrame {
public SliderExample1() {
	JSlider slider=new JSlider(JSlider.HORIZONTAL,0,50,25);
	JPanel panel=new JPanel();
	panel.add(slider);
	add(panel);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SliderExample1 frame=new SliderExample1();
		frame.pack();
		frame.setVisible(true);
	}

}
