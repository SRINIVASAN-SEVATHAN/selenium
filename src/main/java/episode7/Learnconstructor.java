package episode7;

public class Learnconstructor {
	
	/*public Learnconstructor()
	{
	this.x = 1000;
	}*/
	
	//constructor with parameter
	
	public Learnconstructor(int x)
	{
		this.x = x;
	}
	
	// Constructor overloading
	
	public Learnconstructor(int x, String name)
	{
		this.x = x;
		this.name = name;
	}
	
	
	int x;
	String name; //instance variable
	
	void display()
	{
		System.out.println(x+ "--->" +name);
	}

	public static void main(String[] args) {
		
		Learnconstructor lc1 = new Learnconstructor(1000);
		lc1.display();
				
		Learnconstructor lc2 = new Learnconstructor(2000,"Srinivasan");
		lc2.display();
						
	}

}
