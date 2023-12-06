class TestMultiNaming1 extends Thread{
	public void run() {
		System.out.println("runing..");
	}
}
public class threadName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestMultiNaming1 t1=new TestMultiNaming1();
TestMultiNaming1 t2=new TestMultiNaming1();
System.out.println("Name of t1:"+t1.getName());
System.out.println("Name of t1:"+t2.getName());
t1.start();
t2.start();
t1.setName("Sonoo Jaiswal");
System.out.println("After changing name of t1:"+t1.getName());
	}

}
