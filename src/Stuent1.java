	
	public class Stuent1 {
		
		int rollNo;
		
		String name;
		
		float marks;
		
		Stuent1(int studRoll, String studName, float studMark)
		
		{
			rollNo= studRoll;
			
			name= studName;
			
			marks= studMark;
			
		}
			
			void getdisplay()
			{
				
				System.out.println("RollNo=" +rollNo);
				System.out.println("Name=" +name);
				System.out.println("Mark=" +marks);
				
			}
			
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Stuent1 s1= new Stuent1(777, "Abhi", 87.23f);
			s1.getdisplay();
			Stuent1 s2= new Stuent1(111, "Ram", 78.23f);
			s2.getdisplay();
	
		}
	
	}
