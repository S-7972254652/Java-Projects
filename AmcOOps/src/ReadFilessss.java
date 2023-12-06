import java.io.FileInputStream;

public class ReadFilessss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream fin=new FileInputStream("C:\\\\\\\\InputOutput//test");
	int i=fin.read();
	System.out.println((char)i);
	fin.close();
	
}catch(Exception e) {System.out.println(e);}
	}

}
