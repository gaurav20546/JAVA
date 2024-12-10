package mutipleinheritance;

public class Vehicle {

	String maker;
	String model;
	int year;
	 
	Vehicle(String maker,String model,int year )
	{
		this.maker=maker;
		this.model=model;
		this.year=year;
	}
	public void Display()
	{
		System.out.println("maker :"+maker);
		System.out.println("model :"+model);
		System.out.println("year  :"+year);
	}
	
}
