import java.util.Scanner;

public class Pno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,c,r,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no");
n=sc.nextInt();
c=n;
while(n>0) {
	r=n%10;
	s=(s*10)+r;
	n=n/10;
}
if(c==s) {
	System.out.println("Palindrome No");
}
else {
	System.out.println("Not Palindrome No");
}
	}

}
