import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class file3b {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
FileOutputStream fout=new FileOutputStream("C:\\InputOutput//test");

BufferedOutputStream bout1=new BufferedOutputStream(fout);
String s="Welcome to javaTpoint";
byte b[]=s.getBytes();
bout1.write(b);
bout1.flush();
bout1.close();
fout.close();
System.out.println("Sucess");

	}

}
