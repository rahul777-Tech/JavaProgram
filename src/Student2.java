
public class Student2 {
	
	int id;
	
	String name;
	
	int age;
	
	
	
	Student2(int i, String n){
		
		id= i;
		
		name= n;
		
			
	}
	
	Student2(int i, String n, int a){
		
		id= i;
		
		name= n;
		
		age= a;
		
		
	}
	void display() {
		
		System.out.println(id+" "+name+" "+age);
		//System.out.println(id+" "+name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 s2= new Student2(888, "Sham", 22);
		s2.display();
		Student2 s3= new Student2(999, "Sundar");
		s3.display();
		
			
			
			
			
			
		}

	}


