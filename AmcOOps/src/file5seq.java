import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class file5seq {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		   FileInputStream input1=new FileInputStream("C:\\InputOutput//test.txt");    
		   FileInputStream input2=new FileInputStream("C:\\InputOutput//test.txt");    
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close();    
		  } 
}
