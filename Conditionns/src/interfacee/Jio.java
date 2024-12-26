package interfacee;

public class Jio implements SIMCardInterface {
	private String phoneNo;
	private String provider="Jio";
	private boolean isActive;
	
	Jio(String phoneNo)
	{
		this.phoneNo=phoneNo;
		this.isActive=false;
	}
	
	@Override
	public String  getPhoneNO() {
		System.out.println("Get phone number :");
		return phoneNo;
		
	}

	@Override
	public String  NetorkPro() {
		System.out.println("Netework provider :");
		return provider;
		
	}

	@Override
	public void activSim() 
	{
		isActive = true;
	    System.out.println(provider + " SIM card activated.");
	
	}

	@Override
	public void deactivSim() {
		isActive = true;
	    System.out.println(provider + " SIM card activated.");
	
	}

}
