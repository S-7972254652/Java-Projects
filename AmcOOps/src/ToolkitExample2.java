import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class ToolkitExample2 {
	ToolkitExample2(){
		Frame f=new Frame();
		Image icon=Toolkit.getDefaultToolkit().getImage("\"C:\\icon.png\"");
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
new ToolkitExample2();
	}

}
