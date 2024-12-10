package AbstractProgramms;

import New.maintheater;

/*Program 1:
----------
We have a class named as Car and it is abstract class we need to implement abstract method in 
sub class named as Test
For abstract class Car 
Instance Variables:
brand : String default
model : String default
mileage : int default
top_speed : int default
yearOfManufacturing : int default
Methods:
No Argument Constructor
carBrand() : String : It return brand of the car by using brand variable so initialize brand variable and return it.

carModel() : String : It return model of the car by using model variable so initialize model variable and return it.

carMileage() : int : It return mileage of the car by using mileage variable so initialize mileage variable and return it 

carTopSpeed() : int : It return topspeed of the car by using top_speed variable so initialize top-speed variable and return it 

carYear() : int : It return year of manufacturing of the car by using yearOfManufacturing 

variable so initialize yearOfManufacturing variable and return it
display() : void : abstract : This is abstract method to implement in 

sub class
Create a sub class of Car called as Test
Methods:
@Override
display(): void : It print all the details of parent class
This class having main method to test the solutions of parent class*/
abstract  class Car{
	String brand;
	String model;
	int milage;
	int top_Speed;
	int yearOFManufacturing;
	
	
	public Car(String brand, String model, int milage, int top_Speed, int yearOFManufacturing) {
		super();
		this.brand = brand;
		this.model = model;
		this.milage = milage;
		this.top_Speed = top_Speed;
		this.yearOFManufacturing = yearOFManufacturing;
	}
	public String carBrand()
	{
		return brand;
	}
	public String carModel() 
	{
		return model;
	}
	
	public int carMileage()
	{
		return milage;
	}
	public int carTopSpeed()
	{
		return top_Speed;
	}
	public int carYear() 
	{
		return yearOFManufacturing;
	}
	public abstract void display();

}
public class test extends Car
{
	public test(String brand, String model, int milage, int top_Speed, int yearOFManufacturing) {
		super(brand, model, milage, top_Speed, yearOFManufacturing);
		
	}


	public static void main(String []args )
	{
		test t=new test("suzuki","dd",12,120,2020);
		t.display();
	}
	

	@Override
	public void display()
		{
		System.out.println("Car Brand:"+brand);
		System.out.println("Car Model:"+model);
		System.out.println("milage :"+milage);
		System.out.println("top_Speed :"+top_Speed);
		System.out.println("year of manufacturing :"+yearOFManufacturing);
		}
		
}

