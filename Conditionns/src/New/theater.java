package New;/*Create a base class Theater:

Declare the following instance variables:
String theaterName - Represents the name of the theater.
boolean is3DEnabled - Indicates whether the theater supports 3D movies (true) or not (false).

Create a parameterized constructor to initialize these variables.

Declare a method getTheaterDetails():
[print the  details ]
Return an object of type Theater.


Create a subclass IMAXTheater:
Inherit from the Theater class.
Override the getTheaterDetails()
Return an object of type IMAXTheater.

Create another subclass PremiumTheater:
Inherit from the Theater class.
Override the getTheaterDetails() 
Return an object of type PremiumTheater.
Create another subclass RegularTheater:
Override the getTheaterDetails() 
Return an object of type RegularTheater.


[For each subclass, implement additional messages for unique features like seating, ticket pricing, or sound quality.]

Create a test class MovieExperienceSimulator:

Create objects for the base class (Theater) and each subclass (IMAXTheater, PremiumTheater, RegularTheater).
Call the getTheaterDetails() method on each object. by applying covarient concept.*/

public class theater {/*

*/
	String theaterName;
	boolean is3DEnabled;
	theater(String theaterName,boolean is3DEnabled)
	{
		this.theaterName=theaterName;
		this.is3DEnabled=is3DEnabled;
	}
	theater ()
	{
		super();
	}
	public theater  getheaterDetails()
	{
		System.out.println("teater name:"+theaterName);
		System.out.println("id :"+is3DEnabled);
		return new theater();
	}
}
class IMAXTheater extends theater{
	@Override
	public theater  getheaterDetails()
	{
		System.out.println("teater name:"+theaterName);
		System.out.println("id :"+is3DEnabled);
		return new IMAXTheater();
	}/*Create another subclass PremiumTheater:
Inherit from the Theater class.
Override the getTheaterDetails() 
Return an object of type PremiumTheater.
Create another subclass RegularTheater:
Override the getTheaterDetails() 
Return an object of type RegularTheater.*/
	
}
class PremiumTheater extends theater{
	@Override
	public theater  getheaterDetails()
	{
		System.out.println("teater name:"+theaterName);
		System.out.println("id :"+is3DEnabled);
		return new PremiumTheater();
	}
	
}
class RegularTheater extends theater{
	
	@Override
	public theater  getheaterDetails()
	{
		System.out.println("teater name:"+theaterName);
		System.out.println("id :"+is3DEnabled);
		return new RegularTheater();
	}
}
