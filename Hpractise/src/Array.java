import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");
for(int i=0;i<a.length;i++) {
a[i]=sc.nextInt();
}
System.out.println("Array = ");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
System.out.println("Avaerage is = ");
for(int i=0;i<a.length;i++) {
System.out.println(a[i]/5);	
}
	}

}
