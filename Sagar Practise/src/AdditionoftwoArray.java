import java.util.Scanner;

public class AdditionoftwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");
for(int i=0;i<a.length;i++) {
for(int j=0;j<a.length;j++) {
a[i][j]=sc.nextInt();	
}


}
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println(" ");
}
for(int i=0;i<b.length;i++) {
for(int j=0;j<b.length;j++) {
b[i][j]=sc.nextInt();	
}


}
for(int i=0;i<b.length;i++) {
	for(int j=0;j<b.length;j++) {
		System.out.print(b[i][j]+" ");
	}
	System.out.println(" ");
}
System.out.println("Sum =");
for(int i=0;i<c.length;i++) {
	for(int j=0;j<c.length;j++){
	c[i][j]=a[i][j]+b[i][j];
	System.out.print(c[i][j]+" ");
	}
	System.out.println();

}

	}

}
