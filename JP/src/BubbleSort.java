//from low to High Values
public class BubbleSort {

	public static void main(String[] args) {
int a[]= {10,49,51,0,-2,5,40,2};
int temp;
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length-1;j++) {
		if(a[j+1]<a[j]) {
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
	}
}
}
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	}}
