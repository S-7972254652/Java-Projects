import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		a[i][j]=sc.nextInt();
	}
}
System.out.println("First Array = ");
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length;j++) 
	{
	System.out.print(a[i][j]+" ");	
	}
	System.out.println();
}
for(int i=0;i<a.length;i++) {
	for(int j=0;j<b.length;j++) {
		b[i][j]=sc.nextInt();
	}
}
System.out.println("Second Array = ");
for(int i=0;i<b.length;i++)
{
	for(int j=0;j<a.length;j++) 
	{
	System.out.print(b[i][j]+" ");	
	}
	System.out.println();
}
System.out.println("The Sum Of Two Arrays Are = ");
for(int i=0;i<c.length;i++) {
	for(int j=0;j<c.length;j++) {
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}

	}

}
