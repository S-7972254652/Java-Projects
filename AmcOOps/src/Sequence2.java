import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Sequence2 {

	public static void main(String args[])throws IOException{    
		// TODO Auto-generated method stub
FileInputStream fin=new FileInputStream("C:\\InputOutput//test.txt");
FileInputStream fin2=new FileInputStream("C:\\InputOutput//test.txt");
FileInputStream fin3=new FileInputStream("C:\\InputOutput//test.txt");
FileInputStream fin4=new FileInputStream("C:\\InputOutput//test.txt");
Vector v=new Vector();
v.add(fin);
v.add(fin2);
Enumeration e=v.elements();
SequenceInputStream bin=new SequenceInputStream(e);
int i=0;
	}

}
