import java.io.FileOutputStream;

public class file2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fout=new FileOutputStream("C:\\\\InputOutput//test");
	String s="Welcome to javaTpoint";
	byte b[]=s.getBytes();
	fout.write(b);
	fout.close();
	System.out.println("Success");
}catch(Exception e) {System.out.println(e);}
	}

}
