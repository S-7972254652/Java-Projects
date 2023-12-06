import java.util.Scanner;

public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[9];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
System.out.println("Even Position Of Array is = ");
for(int i=0;i<a.length;i=i+1) {
	System.out.println(a[i]);
}
	}

}
