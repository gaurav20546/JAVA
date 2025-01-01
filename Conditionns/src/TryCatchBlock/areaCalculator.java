package TryCatchBlock;

import java.util.Scanner;

public class areaCalculator {
	public static double calculateArea(double length,double width)
	{
		try {
			if(length<0 || width<0)
			{
				throw new IllegalArgumentException();
			}
			return length*width;
			
		}
		catch(IllegalArgumentException e)
		{
			System.err.println("length and width must be positive");
			System.out.println(e.toString());
		}
		return width;
	
	}
	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the length :");
			double len=sc.nextDouble();
			System.out.println("Enter the width :");
			double wid=sc.nextDouble();
			System.out.println("area of rectangle length is "+len+" width "+wid +"is "+calculateArea(len,wid));
			
		}
	}

}
/*Ques - 3
------------
Rectangle Area Calculation with Exception Handling
Objective:
Write a Java program that calculates the area of a rectangle. Implement exception handling to throw and catch an IllegalArgumentException
 when the dimensions (length or width) provided by the user are non-positive.

Instructions:
Create a class named AreaCalculator:

Implement a static method calculateArea :
Takes two integer parameters: length and width.
Access Modifier : public
Non-Access Modifier : static
return type : double
parameters : double, double

Calculates the area using the formula length * width.
Throws an IllegalArgumentException if either length or width is non-positive.
Implement the main method:

Inside the main method, use a Scanner object to read input from the user.
Prompt the user to enter the length and width of the rectangle.

Call the calculateArea method within a try-catch block to handle any IllegalArgumentException.
Print the area of the rectangle if dimensions are valid; otherwise, print an error message.
Test the program:

Write test cases for both valid and invalid inputs:
Test with positive values for length and width.
Test with non-positive values for length and width to ensure the exception is properly thrown and caught.

Test Case 1: Valid Input
Enter length of rectangle: 5
Enter width of rectangle: 4
Area of rectangle with length 5 and width 4 is: 20.0

Test Case 2: Invalid Input
Enter length of rectangle: -3
Enter width of rectangle: 6
IllegalArgumentException caught: Dimensions must be positive: length=-3, width=6
*/