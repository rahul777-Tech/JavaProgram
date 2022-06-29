
public class ConstructorDemo {
	
	int i;
	String s;
	
	
	void display() {
		
		System.out.println(i+" "+s);

	}
	
	public ConstructorDemo(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("parameterized construcor");
	}
	
	
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd= new ConstructorDemo(10);
		cd.display();
		
		
	}

}
