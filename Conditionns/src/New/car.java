package New;
//Create the Car Class
//--------------------
//A class to represent a car with make, model, and an engine.
//Variable Declarations:
//
//private String make; — This variable stores the make of the car.
//private String model; — This variable stores the model of the car.
//private Engine engine; — This variable stores the engine object of the car.
//
//Constructor Declaration:
//public Car(String make, String model, Engine engine) — A constructor that initializes the car's make, model, and engine.
//
//toString Method Declaration:
//@Override public String toString() — A method to return a string representation of the car.


public class car {
private String  model;
private String make;
private engeen engeen;

public car(String make,String model,engeen engeen)
{
	super();
	this.model=model;
	this.make=make;
	this.engeen=engeen;
	
}

@Override
public String toString() {
	return "car [model=" + model + ", make=" + make + ", engeen=" + engeen + "]";
}
	
	
	
}
