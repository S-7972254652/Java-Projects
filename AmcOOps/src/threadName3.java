class TestMultiNaming2 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class threadName3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestMultiNaming2 t1=new TestMultiNaming2();
TestMultiNaming2 t2=new TestMultiNaming2();
t1.start();
t2.start();
	}

}