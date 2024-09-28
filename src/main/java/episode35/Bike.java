package episode35;

public class Bike extends Vehicle {
	
	public boolean HasDisk()
	{
		return true;
}
	public void applyBrake()
	 {
		super.applyBrake();
		 System.out.println("Bike---> Brake Applied");
	 }
}