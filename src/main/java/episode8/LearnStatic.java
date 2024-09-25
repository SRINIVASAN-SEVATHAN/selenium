package episode8;

public class LearnStatic {
	
	int x = 0; // instance variable
	static int y = 0; //static variable
	
	void display()
	{
		x++;
		y++;
		System.out.println("non static ==> " +x+ " non static ==> " +y );
	}

	public static void main(String[] args) 
	{
		LearnStatic ls = new LearnStatic();
		ls.display();
		ls.display();
		
		LearnStatic ls1 = new LearnStatic();
		ls1.display();
		ls1.display();
		
		LearnStatic ls3 = new LearnStatic();
		ls3.display();
		ls3.display();
		
		
	}

}
