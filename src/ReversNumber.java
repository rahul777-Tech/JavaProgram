
public class ReversNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number= 89631;
					
			int rev_num=0;
			
			while(number>0) {
				
				int rem=number%10;
				
				number=number/10;
				
				rev_num=rev_num*10+rem;
				
				
			}
			System.out.println(rev_num);
			
			
	}

}
