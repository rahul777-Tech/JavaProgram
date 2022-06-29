
public class PatternPrnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_row=5;
		for(int row=1; row<=5; row++) {
			
			for(int st=1; st<=total_row-row+1; st++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		int row = 0;
		for(int sp=1; sp<=row-1; sp++) {
			
			System.out.print(" ");
			
		}

	}

}
