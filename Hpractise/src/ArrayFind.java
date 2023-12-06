import java.util.Scanner;

public class ArrayFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");
int x[]=new int[5];
x=a;

for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
System.out.println(" the array elements is = ");
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
System.out.println(" the array elements in x = ");
for(int i=0;i<x.length;i++) {
	System.out.println(x[i]);
}
	}

}
