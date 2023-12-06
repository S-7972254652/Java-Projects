class Multi extends Thread{
	public void run() {
		System.out.println("Thread is runing");
	}
}
public class MultiThreading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multi t1=new Multi();
t1.start();
	}

}
