package mutipleinheritance;

public class car extends Vehicle {
	int noOfDoars;
	car(String maker, String model, int year,int noOfDoars)
	{
		super(maker, model, year);
		if(noOfDoars>=1 && year>=1)
		{
		this.noOfDoars=noOfDoars;
		}
		else 
		{
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
	}
	public void display()
	{

		System.out.println("make:"+super.maker );
		System.out.println("Model"+super.model);
		System.out.println("yaer"+super.year);
		System.out.println("doars :"+this.noOfDoars);
		
	}

}
