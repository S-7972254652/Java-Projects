
public class javaFinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int data=25/5;
	System.out.println(data);
}
catch(NullPointerException e) {
	System.out.println(e);
}
finally {
	System.out.println("finally Block is always executed");
}
System.out.println("Rest of the code");
	}

}
