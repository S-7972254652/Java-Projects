class TestJoinMethod1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1500);
			}catch(Exception e) {
				System.out.println(i);
			}
			System.out.println(i);
		}
	}
}
public class classTestJoind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestJoinMethod1 t1=new TestJoinMethod1();
TestJoinMethod1 t2=new TestJoinMethod1();
TestJoinMethod1 t3=new TestJoinMethod1();
t1.start();
try {
	t1.join(1500);
}catch(Exception e) {
	System.out.println(e);
}
t2.start();
t3.start();

	}

}
