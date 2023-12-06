import java.io.FileOutputStream;

public class file1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fout=new FileOutputStream("C:\\InputOutput//test");
	fout.write(65);
	fout.close();
	System.out.println("Sucess");
}catch(Exception e) {System.out.println(e);}
	}

}
