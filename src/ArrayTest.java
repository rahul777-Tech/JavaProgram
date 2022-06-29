
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {20,42,50,60,65,70,75,80};
		
		int maxNumber=a[0];
		for(int i=1; i<a.length; i++) {
			
			if(maxNumber<a[i]) {
				
				maxNumber=a[i];
			}
		}
		System.out.println(maxNumber);

	}

}
