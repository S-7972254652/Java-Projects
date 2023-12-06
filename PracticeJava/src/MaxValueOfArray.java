
public class MaxValueOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,5,4,8,22,21,56,895};
int max=a[0];
for(int i=0;i<a.length;i++) {
if(a[i]<max) 
	max=a[i];

}
System.out.println("Max no in the given array"+max);

	}

}
