package Inheritance;

public class AnimalOne {
	
	void eat() {
		
		System.out.println("i am eating");
	}
	
}
	
	class Dog extends AnimalOne{
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		   Dog d=new Dog();
		   d.eat();

		}
		
	}

	
	
	