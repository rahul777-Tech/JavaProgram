package Array;

public class BigNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						
		int[] a= {10, 23, 54, 88, 99, 111};
		
		int big= a[0];
				
		for(int i=1; i<a.length; i++) {
			
			if(a[i]>big) {
				
				big= a[i];
				
				
			}
			
			}
				System.out.println("This is Big Number in Given Array"+" "+big);
		}

	}

