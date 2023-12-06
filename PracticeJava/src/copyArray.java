import java.util.Scanner;

public class copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
int b[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
System.out.println("First Array");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
System.out.println("\n Second Array=");

for(int i=0;i<a.length;i++) {
	b[i]=a[i];
	System.out.print(b[i]+" ");
}
	}

}
