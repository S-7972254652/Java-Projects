import java.util.Scanner;

public class SumOfAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
	sum=sum+a[i];
	

}
System.out.println("The sum of all array elements is = "+sum);
	}

}
