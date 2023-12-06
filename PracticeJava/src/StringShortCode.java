import java.util.Scanner;

public class StringShortCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the STring");
name=sc.next();
String result="";
for(int i=name.length()-1;i>=0;i--) {
	result+=name.charAt(i);
}
System.out.println(result);
	}

}
