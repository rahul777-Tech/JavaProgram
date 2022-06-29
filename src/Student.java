
public class Student {
	
	int rollNo;
	String name;
	String address;
	
	Student(int studRollNo, String studName, String studAddress){
		
		rollNo= studRollNo;
		name= studName ;
		address= studAddress ;
		
	}
	
	void getStudent() {
		
		System.out.println("Name=" +name);
		System.out.println("Address=" +address);
		System.out.println("Roll No=" +rollNo);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Student s=new Student(777, "Mahi", "Pune");
		Student s1=new Student(888, "Sachin", "Mumbai");
		s.getStudent();
		s1.getStudent();

	}

}
