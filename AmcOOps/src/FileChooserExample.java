import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class FileChooserExample extends JFrame implements ActionListener {
JMenuBar mb;
JMenu file;
JMenuItem open;
JTextArea ta;
FileChooserExample(){
	open=new JMenuItem("OpenFile");
	file.add(open);
	mb=new JMenuBar();
	mb.setBounds(0, 0, 800, 20);
	mb.add(file);
	ta=new JTextArea(800,800);
	ta.setBounds(0, 20, 800, 800);
	add(mb);add(ta);
}
public void actionPerformed(ActionEvent e) {   
	if(e.getSource()==open) {
		JFileChooser fc=new JFileChooser();
		int i=fc.showOpenDialog(this);
		if(i==JFileChooser.APPROVE_OPTION) {
			File f=fc.getSelectedFile();
			String fiepath=f.getPath();
			try {
				  BufferedReader br=new BufferedReader(new FileReader(filepath));    		}
	}	
}
	public static void main(String[] args) {
	

	}

}
