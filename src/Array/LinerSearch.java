package Array;

public class LinerSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5, 6, 3, 8, 1};
		
		int item= 55;
		
		int temp=0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]==item) {
				
				System.out.println(i);
				
				temp=temp+1;
			}
		}
		
		if(temp==0) {
			
			System.out.println("number is not in list");
		}
		

	}

}
