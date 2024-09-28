package episode34;

public interface RBI {
	
	int UPILimit = 100000;
	public void AadhaarMandatory();
	public void PanMandatory(boolean a);
	boolean PanMandatory();
	
	default void HousingLoan()
	{
		System.out.println("Housing Loan");
	}
	
	static void BikeLoan()
	{
		System.out.println("Bike Loan");
	}

}
