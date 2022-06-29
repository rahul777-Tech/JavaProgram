
public class StarPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total_row=5;
		
		for(int row=1; row<=5; row++) {
			
			for(int st=1; st<=row; st++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		for(int row=1; row<=5; row++) {
			
			
			
			for(int st=1; st<=total_row-row+1; st++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
