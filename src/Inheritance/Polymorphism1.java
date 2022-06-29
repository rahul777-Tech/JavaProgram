package Inheritance;

public class Polymorphism1 {
	
	void show(int a, String name ) {
		
		
		System.out.println("1");
	}
}
	
class xyz extends Polymorphism1{
	
	void show(int a, String name ) {
		
		
		System.out.println("2");
	}	
	
		
		public static void main(String[] args) {
		//Polymorphism1 pm=new Polymorphism1();
		//pm.show(222, "Ramu");
		xyz x=new xyz();
		x.show(333, "Raj");
		}

	}


