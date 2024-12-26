package interfacee;

public class BSNL implements SIMCardInterface {

	 private String phoneNo;
		private String provider="BSNL";
		private boolean isActive;
		
		BSNL(String phoneNo)
		{
			this.phoneNo=phoneNo;
			this.isActive=false;
		}
	 
	@Override
	public String getPhoneNO() 
	{
		System.out.println("Get phone number :");
		return phoneNo;
	}

	@Override
	public String NetorkPro() 
	{
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
	public void deactivSim()
	{
		
		 isActive = false;
		 System.out.println(provider + " SIM card activated.");
	
	}

}
