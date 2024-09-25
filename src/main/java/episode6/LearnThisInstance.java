package episode6;

public class LearnThisInstance {
	int c; // instance variable
	int d;
	void addnumbers(int a, int b)
	{
		int c = 40; // local variable
		System.out.println(d);
		System.out.println(a+b+ this.c +d);
	}
	
	
public static void main(String[] args) {
		
		LearnThisInstance add = new LearnThisInstance();
		add.addnumbers(20,30);
		
		

	}

}
