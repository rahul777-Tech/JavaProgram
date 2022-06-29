
public class StarPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total_row=5;
		
			for(int i=1; i<= total_row; i++) {	
				for(int j=1; j<=total_row; j++) {
					
					if(j<=total_row-i) {
						System.out.print(" ");
					}
					else
					System.out.print("* ");
					
				}	
				System.out.println();
		}

	}

}
