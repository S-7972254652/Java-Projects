import java.util.Scanner;

public class CopyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
int b[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");
for(int i=0;i<a.length;i++) {	
		a[i]=sc.nextInt();	
}
for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");	
}
System.out.println();
System.out.println("The Copy of a in b is = ");

for(int i=0;i<b.length;i++) {
	b[i]=a[i];
	System.out.print(b[i]+" ");
}
	}

}
