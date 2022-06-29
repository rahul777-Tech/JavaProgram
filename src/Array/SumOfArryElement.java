package Array;

public class SumOfArryElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2, 6, 8, 3, 1};
		
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}
	}