import java.util.Scanner;

public class ft {

	public static void main(String[] args) {
		int no;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no");
		no=sc.nextInt();
		int fact=1;
		for(int i=1;i<=no;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
	
	}

}
