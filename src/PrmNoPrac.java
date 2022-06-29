
public class PrmNoPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int no=8;
		int temp=0;
		
		for(int i=1; i<=100; i++) {
			
		
		for(int j=2; j<=100; j++) {
			
			if(i%j==0) {
				
				temp=temp+1;
				
			}
		}
		if(temp==0) {
			
			System.out.println(i+ "no is prime");
		}
		
		else {
			
			System.out.println("not prime");
		}

	}

	}
}
