package TryCatchBlock;

public class carUser {

	public static void main(String[] args) {
			
		try {
			carTest.carHeat(40);
		}
		catch(CarHeatException e)
		{
			
		}
		System.out.println("================================================");
		
		try {
			carTest.puncture("puncture");
		}
		catch(CarPunctureException e)
		{
			
		}
		System.out.println("================================================");
		try {
			carTest.stop("stop");
		}
		catch(CarStopped e)
		{
			
		}
		System.out.println("================================================");
	}

}
/*ELC class CarUser :-
Invoke stop, puncture, and carHeat methods with appropriate messages or temperatures to test different scenarios.
Ensure that exceptions are properly thrown and caught where applicable.

Test Cases for Car Exceptions
----------------------------------
Car Stopped Exception Test:
Action: Invoke CarTest.stop("stop").
Expected Output: Should throw CarStoppedException with message "Car stopped for some reason."

Car Not Started Test:
Action: Invoke CarTest.stop("go").
Expected Output: Should print "Car not stalled."

Car Puncture Exception Test:
Action: Invoke CarTest.puncture("puncture").
Expected Output: Should throw CarPunctureException with message "Car is punctured."

Car Not Punctured Test:
Action: Invoke CarTest.puncture("move").
Expected Output: Should print "Car not punctured."

Car Overheating Exception Test:
Action: Invoke CarTest.carHeat(60).
Expected Output: Should throw CarHeatException with message "Car is heated more than 50 degrees Celsius."

Car Temperature Normal Test:
Action: Invoke CarTest.carHeat(40).
Expected Output: Should print "Car temperature normal."*/
