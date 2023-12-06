import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class CanvasExample {
public CanvasExample()
{
	Frame f=new Frame("Canvas Example");
	f.add(new MyCanvas()); 
	f.setLayout(null);
	f.setSize(400,400);
	f.setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			new CanvasExample(); 
		}
	}
class MyCanvas extends Canvas{
	public MyCanvas() {
		setBackground(Color.GRAY);
		setSize(300,200);
	}
	public void paint(Graphics g) {
	g.setColor(Color.red);
	g.fillOval(75, 75, 150, 75);
	}
}
}
