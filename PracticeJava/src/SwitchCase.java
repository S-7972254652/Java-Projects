import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		no=sc.nextInt();
		switch(no) {
		case 1:System.out.println("ONE");
		break;
		case 2:System.out.println("TWO");
		break;
		case 3:System.out.println("Three");
		break;
		case 4:System.out.println("FOUR");
		default:System.out.println("None Of the no");
		}
	}

}
