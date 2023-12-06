import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");
for(int i=0;i<a.length;i++){
	a[i]=sc.nextInt();	
}
System.out.println("array elements=");
for(int i=0;i<a.length;i++){
	System.out.println(a[i]);	
}
System.out.println("Reverse Array");
for(int i=a.length-1;i>=0;i--){
System.out.print(a[i]+" ");
}
	}

}
