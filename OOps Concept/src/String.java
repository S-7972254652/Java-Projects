import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.next();
		int length=name.length();
		String rev=" ";
		for(int i=length-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
