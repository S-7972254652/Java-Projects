class Multi3 implements Runnable{
	public void run() {
		System.out.println("Thread is runing..");
	}
}
public class thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multi3 m1=new Multi3();
Thread t1=new Thread(m1);
t1.start();
	}

}
