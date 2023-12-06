class ABC extends Thread{
	Thread threadToInterrupt;
	public void run() {
		threadToInterrupt.interrupt();
	}
}
public class SetNameMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	ABC th=new ABC();
	th.threadToInterrupt=Thread.currentThread();
	th.start();
	th.join();
}
catch(InterruptedException ex) {
	System.out.println("The exception has been caught"+ex);

}
	}

}
