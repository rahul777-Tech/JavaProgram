package Inheritance;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love pune";
		
		int length= s.length();
		
		String rev="";
		
		for(int i=length-1; i>=0; i--) {
			
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		
	}

}

