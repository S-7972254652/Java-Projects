import java.util.Scanner;

public class a2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int[2][2];
Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements=");
for(int i=0;i<2;i++) {//rows
	for(int j=0;j<2;j++) {//columns
		a[i][j]=sc.nextInt();
	}
}
	System.out.println("Matrix");
	for(int i=0;i<2;i++) {//rows
		for(int j=0;j<2;j++) {//columns
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
}


}}
