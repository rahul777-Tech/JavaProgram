
public class StarPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total_row=5; 
		
		
		for(int row=1; row<=5; row++) {
			
			
			
			for(int sp=1; sp<=total_row-row; sp++) {
				
				System.out.print(" ");
			}
			
			
			
			for(int st=1; st<=total_row-st; st++) {
				
				System.out.println(" *");
			}
		}

	}
}

