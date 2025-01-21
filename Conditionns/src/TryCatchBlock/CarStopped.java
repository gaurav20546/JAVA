package TryCatchBlock;

@SuppressWarnings("serial")
public class CarStopped extends Exception
{
	public CarStopped()
	{
		
	}	
	public CarStopped(String str)
	{
		System.out.println(str);
	}
	
}
@SuppressWarnings("serial")
class CarPunctureException extends Exception
{
	public CarPunctureException()
	{
		
	}
	public CarPunctureException(String str)
	{
		System.out.println(str);

	}
}
@SuppressWarnings("serial")
class CarHeatException extends Exception{
	
	public CarHeatException()
	{
		
	}
	public CarHeatException(String str)
	{
		System.out.println(str);
	}
		
}
class carTest{
	
	public static void stop(String s) throws CarStopped
	{
		if(s.equalsIgnoreCase("stop"))
		{
			throw new CarStopped("order for car stop !");
		}
		else if(s.equalsIgnoreCase("go"))
		{
			System.out.println("car is not stalled");
		}
	}
	public static void puncture(String s) throws CarPunctureException {
		
		if(s.equalsIgnoreCase("puncture"))
		{
			throw new CarPunctureException("car is puncture !");
		}
		else
		{
			System.out.println("car is not stalled");
		}
	}
	public static void carHeat(int n) throws CarHeatException
	{
		if(n>=50)
		{
			throw new CarHeatException( "Car is heated more than 50 degrees Celsius.");
		}
		else if(n<=50)
		{
			System.out.println("car is not stalled");
		}
	}
}
/*Ques - 1
----------------
Implement a Java program that simulates various car-related exceptions using custom exception classes (CarStopped, CarPuncture, CarHeat). The program should handle different scenarios and test cases using the CarTest class and demonstrate exception handling through static methods.

For CarStoppedException: extends Exception
Purpose: Represents an exception when the car stops for reasons other than puncture or overheating.

Instance Methods:
No Instance methods

Methods:
Parameterized Constructor with String as parameter

For CarPunctureException: extends Exception
This class is used for raise the exception if car is punctured.
Instance Methods:
No Instance methods

Methods:
Parameterized Constructor with String as parameter

For CarHeatException: extends Exception
This class is used for raise the exception if the car engine is more than 50 degrees Celsius

Instance Methods:
No Instance methods

Methods:
Parameterized Constructor with String as parameter

For CarTest class:
Contains static methods to simulate car operations and throw exceptions based on certain conditions.

Instance Variables:
No Instance Variables

Methods:
Stop(String): void: static

This class throws CarStoppedException. If the string is  stop  throw new exception and get the message or else message is Car not stall


Methods:
puncture(String): void: static: public

This class throws CarPunctureException. If the string is  puncture  throw new exception and get the message line  Car is punctured  or else message is Car not stall.

Methods:
carHeat(int): void: static : public

This class throws CarHeatException. If the car heat is more than 50 degrees calicoes it throw new exception and get the message line  Car is heated more the 50 degrees  or else message is Car not stall.

*/










