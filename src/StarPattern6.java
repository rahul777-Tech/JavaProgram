
public class StarPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total_row=5;
		
		for(int row=1; row<=5; row++) {
			
			for(int st=1; st<=total_row-row+1; st++) {
				
				System.out.print("*");
			}
			
					
			for(int sp=1; sp<=total_row+row-6; sp++) 
				
			{
				
				System.out.println("");
			}
		}

	}

}
