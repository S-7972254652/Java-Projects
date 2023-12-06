 class MyThread2 implements Runnable{
	public void run()
	{
		System.out.println("Now the thread is runing..");
	}
}
public class thread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable r1=new MyThread2();
Thread th1=new Thread(r1,"My New Thread");
th1.start();
String str=th1.getName();
System.out.println(str);
	}

}
