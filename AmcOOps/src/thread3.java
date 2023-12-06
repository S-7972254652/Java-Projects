
public class thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=new Thread("My First Thread");
t.start();
String str=t.getName();
System.out.println(str);
	}

}
