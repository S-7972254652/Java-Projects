import java.util.Scanner;

public class CopyArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
int b[]=new int[5];

Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements=");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
System.out.println("First array=");
for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
}
System.out.println("Second Array");
for(int i=0;i<a.length;i++) {
	b[i]=a[i];
	System.out.println(b[i]);
}
	}

}
