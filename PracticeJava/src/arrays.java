
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[3];
a[0]=80;
a[1]=20;
a[2]=40;
for(int i=0;i<3;i++) {
	System.out.println(a[i]+" ");
}
if(a[0]>a[1]&&a[0]>a[2]) {
	System.out.println("a[0] is grater ="+a[0]);
}
else if(a[1]>a[0]&&a[1]>a[2]) {
	System.out.println("a[1] is grater ="+a[1]);
}
else {
	System.out.println("a[2] is grater ="+a[2]);

}
	}

}
