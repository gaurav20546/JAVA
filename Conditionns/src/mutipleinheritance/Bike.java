package mutipleinheritance;

public  class Bike extends Vehicle {
	String type;
	Bike(String maker, String model, int year,String type) {
		super(maker, model, year);
		this.type=type;
	}
	public void Display()
	{
		System.out.println("type :"+this.type);
		System.out.println("make"+super.maker);
		System.out.println("model"+super.model);
		System.out.println("year"+super.year);
		
		
	}
}
