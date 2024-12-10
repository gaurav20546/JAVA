package New;
/*Create a Main class that creates a Car object and sets its attributes and the attributes of its 
 * driver. Then, create a copy of the Car object using the copy constructor
 and print the attributes of both the original and the copy of the Car objects to confirm that the
  copy constructor works correctly.
Finally, use the changeDriver() method to change the driver of the original Car object, and print the
 attributes of both the original and the copy of the Car objects
 again to confirm that the copy constructor created a deep copy of the Driver object and that the 
 changeDriver method did not affect the driver of the copy of the Car 
object.*/



public class MainCarDriver
{
	public static void main(String [] args )
	{
	
		        // Create a Driver object
				DriverNew d=new DriverNew("gauav",23);

		        // Create a Car object
		        carNew oc = new carNew("Hyundai", "Creta", 2023, d);
	

		        // Create a copy of the Car object
		        carNew copiedCar = new carNew(oc);

		        // Print details of both original and copied Car objects
		        System.out.println("Original Car: " + oc);
		        System.out.println("Copied Car: " + copiedCar);

		        // Change the driver of the original Car object
		        Driver newDri = new Driver("David", 35);
		        oc.changeDriver(newDri);

		        // Print details of both original and copied Car objects again
		        System.out.println("\nAfter changing the driver of the original car:");
		        System.out.println("Original Car: " + oc);
		        System.out.println("Copied Car: " + copiedCar);
		    }
		
}
