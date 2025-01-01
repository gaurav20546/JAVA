package TryCatchBlock;

public class divisionExample {
	static int sum=0;
	
	public static int performDivision(int divident ,int divisor)
	{
		try {
			 sum=divident/divisor;
			
		}
		catch(ArithmeticException e)
		{
			
			System.err.println("Divisor you cant declare zero");
			System.out.println(e.toString());
		}
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println("result of Division is "+performDivision(10,0));
	}

}
/*Handling ArithmeticException 
Objective:
Write a Java program that demonstrates how to handle ArithmeticException. The program should include a method that performs division and throws an ArithmeticException if division by zero occurs. Implement exception handling in the main method to catch and handle this exception.

Instructions:
Create a class named DivisionExample:

Implement a static method performDivision :
Takes two integer parameters: dividend and divisor.
Access Modifier : public
Non-Access Modifier : static
return type : int
parameters : int, int

Performs division dividend / divisor.
Throws an ArithmeticException if divisor is zero.

Implement the main method:
Inside the main method, call the performDivision method with different inputs, including zero as a divisor.
Use a try-catch block to catch and handle any ArithmeticException thrown by performDivision.
Print an appropriate error message when division by zero occurs.
Test the program:

Write test cases to cover scenarios with valid and invalid inputs for the divisor, including zero.

Test Case 1: Valid division
Input as : 
Enter dividend : 10
Enter divisor : 2

Output as :
Result of division: 5

Test Case 2: Division by zero
Input as : 
Enter dividend : 5
Enter divisor : 0

Output :
ArithmeticException caught: Division by zero: dividend=5, divisor=0*/