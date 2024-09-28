package episode34;

public class Customer {
	
	public static void main(String[] args)
	{
		HDFCChennai chennai = new HDFCChennai();
		chennai.PanMandatory();
		
		Axis Mybank = new Axis();
		Mybank.AadhaarMandatory();
		boolean Mypancard =  Mybank.PanMandatory();
		System.out.println(Mypancard);
		Mybank.InterestFreeLoan();
		System.out.println(Axis.UPILimit);
		
	}


}
