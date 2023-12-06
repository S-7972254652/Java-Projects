import java.awt.Dimension;
import java.awt.Toolkit;

public class ToolkitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Toolkit t=Toolkit.getDefaultToolkit();
System.out.println("Screen Resolution="+t.getScreenResolution());
Dimension d=t.getScreenSize();
System.out.println("Screen Width="+d.width);
System.out.println("Screen heught="+d.height);
	}

}
