package Array;

public class KthPosi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4, 5, 9, 2, 7};
		
		int k=4;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]<a[j]) {
					
					int temp=a[i];
					
						a[i]= a[j];
						
						a[j]= temp;
				}
				
				if(i==k-1) {
					
					break;
									
					
				}
			}
			System.out.print(a[i]+" ");
		}
		
		
		

	}

}
