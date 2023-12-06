package sagar;

public class Array1Stpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double average;
		int[] marks=new int[5];
		marks[0]=59;
		marks[1]=99;
		marks[2]=89;
		marks[3]=79;
		marks[4]=90;
		average=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/3;
		System.out.println(average);
		System.out.println(marks);
		for(int i=0;i<=4;i++) {
			System.out.println(marks[i]);
			
		}
		System.out.println("Size of array is:"+marks.length);
		
		
		
	}

}
