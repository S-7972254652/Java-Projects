package sagar;

public class rname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int length=str.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
