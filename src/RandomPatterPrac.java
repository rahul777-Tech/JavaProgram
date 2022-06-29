
public class RandomPatterPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_row=5;
		
		for(int row=1; row<=total_row; row++) {
			
			
			for(int st=1; st<=total_row-row+1; st++) {
				
			System.out.print("*");
			
					}
				
			for(int sp=1; sp<=total_row%2+row-2; sp++) {
				
				System.out.print(" ");
			}
			
			System.out.println();
			
		}
	}

}
