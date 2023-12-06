import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class file4buf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream fin=new FileInputStream("C:\\InputOutput//test");
	BufferedInputStream bin=new BufferedInputStream(fin);
	int i;
	while((i=bin.read())!=-1) {
		System.out.println((char)i);
	}
	bin.close();
	fin.close();
}catch(Exception e) {System.out.println(e);}
	}

}
