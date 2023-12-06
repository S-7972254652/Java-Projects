import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboExample {
JFrame f;
ComboExample(){
	f=new JFrame("Combo Box Example");
	String country[]={"India","AUS","USA","England","NewZeland"};
	JComboBox cb=new JComboBox(country);
	cb.setBounds(50, 50, 90, 20);
	f.add(cb);
	f.setLayout(null);
	f.setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ComboExample();
	}

}
