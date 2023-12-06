
public class frequencyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={1,12,54,56,58,2,5,1,2,5,54,5660,45,89,52,12};
for(int i=0;i<a.length;i++) {
	int x=a[i];
	int count=0;
	if(x==-1)continue;
	for(int j=0;j<a.length;j++) {
		if(x==a[j])
		{
			count++;
			a[j]=-1;
		}
	}
	System.out.println("The Frequency of"+" "+x+" "+"is = "+count);
	
}
	}

}
