import java.awt.Frame;
import java.util.List;

public class test7 {
test7(){
	Frame f=new Frame();
    List l1 = new List(5);   
	l1.setBounds(100,100,75,85);
	l1.add("Item1");
	l1.add("Item2");
	l1.add("Item3");
	l1.add("Item4");
	l1.add("Item5");
	f.add(l1);
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new test7();
	}

}
