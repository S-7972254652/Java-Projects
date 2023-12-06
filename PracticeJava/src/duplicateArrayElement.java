
public class duplicateArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,1,4,5,4,6,8,6};
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if((a[i]==a[j])&&(i!=j)) {
			System.out.println(a[j]+" ");
		}
	}
}
	}

}
