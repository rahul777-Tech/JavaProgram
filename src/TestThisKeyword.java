
public class TestThisKeyword {
	
	int i;
	
	void SetValue(int x) {
		
		this.i=x;
		
		
	}
	
	void show() {
		
		System.out.println(i);
	}
}

class xyz{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestThisKeyword ttk= new TestThisKeyword();
		ttk.SetValue(10);
		ttk.show();

	}

}
