import java.util.Scanner;

public class ArrayLength12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");
for(int i=5;i<a.length;i++) {
	a[i]=sc.nextInt();
}
for(int i=5;i<a.length;i++) {
	System.out.println(a[i]);
}
System.out.println("The length of the array is = "+a.length);
	}

}
