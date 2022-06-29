
public class ReverseNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int number=25873;

		int rev_number=0;

		for(; number>0; )
		
		//for( ;number != 0; number=number/10)   
		{

		int rem= number%10;

		number=number/10;

		rev_number= rev_number*10+rem;
		}

		System.out.println(rev_number);
		
	
	}
	
	

}
