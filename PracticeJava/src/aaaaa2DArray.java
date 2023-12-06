import java.util.Scanner;

public class aaaaa2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int[3][3];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements=");
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		a[i][j]=sc.nextInt();
	}
	
}
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
}
	}

}
