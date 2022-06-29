	
	public class ConstructorInJava {
		
		ConstructorInJava(){
			
			System.out.println("Default Constructor");
		}
		
	ConstructorInJava(int a, int b){
			
			System.out.println("Constructor with 2 parametrs" );
		}
	ConstructorInJava(int a, int b, float c){
		
		System.out.println("Constructor with 3 parametrs");
	}
		
		
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ConstructorInJava cij= new ConstructorInJava(10,23,12.5f);
			ConstructorInJava cij1= new ConstructorInJava(10,23);
			ConstructorInJava cij2= new ConstructorInJava();
			
			
		}
	
	}
