class StudentPaper{
	void timeTable() {
		System.out.println("Student see 25days before exam");
	}
	final void questions() {
		System.out.println("Questions");
	}
}
class Cheater extends StudentPaper{
	void timeTable() {
		System.out.println("Student see 25days before exam");
	}
	void questions() {
		System.out.println("Questions info");
	}
}
public class StudentFinalPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheater c=new Cheater();
		c.timeTable();
		c.questions();
	}

}
