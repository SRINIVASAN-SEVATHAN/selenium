package episode35;

public class BMW extends Bike {
	
	int mileage = 20;
	
	public String getcolor()
	{
		return"Blue";
	}
	
	public static void main(String[] args) {
		 
		BMW Mybike = new BMW();
		String col = Mybike.getcolor();
		System.out.println(col);
		int mymileage =  Mybike.mileage;
		System.out.println(mymileage);
		boolean hasdisk = Mybike.HasDisk();
		System.out.println(hasdisk);
		Mybike.applyBrake();
		Vehicle Myv = new Vehicle();
		Myv.applyBrake();
		
	}

}
