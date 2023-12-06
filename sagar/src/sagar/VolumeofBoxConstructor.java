package sagar;
class Box{
	int length,width,height,volume;
	Box(int l,int w,int h){
		length=l;
		width=w;
		height=h;
	}
	void calculate() {
		volume=length*width*height;
	}
	void display() {
		System.out.println(volume);
	}
}
public class VolumeofBoxConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,w,h;
		Box b1=new Box(5,20,15);
		Box b2=new Box(10,25,5);
		b1.calculate();
		b1.display();
		b2.calculate();
		b2.display();
	}

}
