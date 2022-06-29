
public class WhilwLoopInJavaPrct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=23579;
		
		int rev_number=0;
		
		while (number>0) {
			
			int rem= number%10;
			
			number=number/10;
			
			rev_number= rev_number*10+rem;	
			
		}
		System.out.println(rev_number);
	}
	
}

