import java.util.Scanner;

public class ReverseArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();	
}
System.out.println("The Normal Array is = ");
for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
}
System.out.println("Reverse Array is=");
for(int i=4;i>0;i--) {
	System.out.println(a[i]);
}
	}

}
