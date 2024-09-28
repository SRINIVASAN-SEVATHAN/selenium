package episode34;

public class Axis implements RBI {
	
	public void InterestFreeLoan()
	{
		System.out.println("Free Loan");
	}

	@Override
	public void AadhaarMandatory() {
			System.out.println("Aadhaar Added");
		
	}

	@Override
	public boolean PanMandatory() {
	return true;
	}
	
	

}
