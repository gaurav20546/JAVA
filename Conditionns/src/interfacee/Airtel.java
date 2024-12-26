package interfacee;

public class Airtel implements SIMCardInterface {

	private String phoneNo;
	private String provider="BSNL";
	private boolean isActive;
	Airtel(String phoneNo)
	{
		this.phoneNo=phoneNo;
		this.isActive=isActive;
		
	}
	@Override
	public String getPhoneNO() {
		System.out.println("Get phone number ");
		return phoneNo;
		
	}

	@Override
	public String NetorkPro() 
	{
		System.out.println("Network provider :");
		return provider;
		
		
	}

	@Override
	public void activSim()
	{
		isActive=true;
		System.out.println(provider + " SIM card activated.");
		
	}
	@Override
	public void deactivSim()
	{
		isActive=false;
		System.out.println(provider+"SIM card activated.");
	}

}
