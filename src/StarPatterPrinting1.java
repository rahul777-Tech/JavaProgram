
public class StarPatterPrinting1 {
	
	public static void main(String args[]) {
		int total_row=6;
		
		for(int row=1; row<=5; row++) {
			
			for(int sp=1; sp<=total_row-row; sp++) {
				
				System.out.print("");
			}
			
			for(int st=1; st<=sp; st++ ) {
			
			System.out.println("*");
		}
		
	}
	}

}
