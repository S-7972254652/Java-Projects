import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;

public class ScrollbarExample2 {
	ScrollbarExample2(){
		Frame f=new Frame("Scrollbar Example");
		final Label label=new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400,100);
		final Scrollbar s=new Scrollbar();
		s.setBounds(100,100,50,100);
		f.add(s);
		f.add(label);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		s.addAdjustmentValueChanged(AdjustmentEvent e){
			label.setText("Vertical Scrollbar Value is:"+s.getValue());
		}

	});
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ScrollbarExample2();
	}

}
