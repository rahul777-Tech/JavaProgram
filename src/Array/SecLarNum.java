package Array;

public class SecLarNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4, 3, 8, 12, 23};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				
				if(a[j]>a[i]) {
					
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
		}
		System.out.println("Second Largest No is"+" "+a[1]);

	}

}
