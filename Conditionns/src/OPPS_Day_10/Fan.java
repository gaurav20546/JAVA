package OPPS_Day_10;

public class Fan {

	String name;
	String coil;
	int Wings;
	
	public void Fandetails()
	{
		System.out.println(" fan name is "+name);
		System.out.println("coil name  is "+coil);
		System.out.println("and wings are "+Wings);
		
	}
	public void switchOn()
	{
		System.out.println("Fan is on");
	}
	public void switchOff()
	{
		System.out.println("Fan is off ");
	}
}
