
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=7;
		int temp=0;
		
		for(int i=2; i<=100; i++ ) {
			
			if(no%i==0) {
				
				temp=temp+1;
			}
			
			
		}
		if(temp==0) {
			
			System.out.println("number is prime");
		}
		
		else {
			
			System.out.println("no is not prime");
		}

	}

}
