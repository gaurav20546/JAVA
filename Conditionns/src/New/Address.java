package New;
//Create Address Class:
//---------------------
//Implement a class with private fields for the street and city.
//Provide a constructor to initialize these fields.
//Implement getters and a toString() method to display the address.

public class Address {
	private String street;
	private String city;
	
	Address(String street,String city)
	{
		this.street=street;
		this.city=city;
	}
	
	public String getstreet()
	{
		return street;
		
	}
	public String getcity()
	{
		return city;
		
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	

}
