package TryCatchBlock;

import java.util.Scanner;

public class numberFormatException_and_NullPointerException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		handleExceptions(str);
	}
	public static void  handleExceptions(String s)
	{
		try {
			System.out.println("Enter a string to convert to an integer:"+s);
			System.out.println("String length is :"+s.length());
			int nu=Integer.parseInt(s);
			System.out.println("Converted number:"+nu);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.toString());
			
}/*Output:
Enter a string to convert to an integer: 123
Length of the input string: 3
Converted number: 123
*/
	}
}
/*Ques - 4
-----------
Handling NumberFormatException and NullPointerException
Objective:
Write a Java program that demonstrates how to handle NumberFormatException and NullPointerException. The program should include a method that takes a string input, prints its length, attempts to convert it to an integer, and performs operations that might result in a NullPointerException. If an exception occurs, it should be caught and an appropriate message should be displayed.

Instructions:
Create a class named ExceptionHandlingDemo:

Implement a static method handleExceptions that takes a String parameter representing the input.
Method name : handleExceptions
Access Modifier : public
Non-Access Modifier : static
return type : void
parameters : String

Inside the method, use a try block to:
Print the length of the input string.
Attempt to convert the string input to an integer using Integer.parseInt().
Attempt to call a method on the input string to deliberately cause a NullPointerException if the string is null.
Catch NumberFormatException and print an appropriate message.
Catch NullPointerException and print an appropriate message.

Create a main method:
Inside the main method, create a Scanner object to read input from the user.
Prompt the user to enter a string.
Read the user's input and pass it to the handleExceptions method.
Close the Scanner object.
Test the program:

Write three test cases:
Input a valid integer string.
Input a non-integer string.
Input a null string to see the NullPointerException handling.

Test Case 1:

Input:
Enter a string to convert to an integer: 123

Output:
Enter a string to convert to an integer: 123
Length of the input string: 3
Converted number: 123

Test Case 2:
Input:
Enter a string to convert to an integer: abc

Output:
Enter a string to convert to an integer: abc
Length of the input string: 3
NumberFormatException: Invalid input, not a number.
java.lang.NumberFormatException: For input string: "abc"
    at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
    at java.base/java.lang.Integer.parseInt(Integer.java:668)
    at java.base/java.lang.Integer.parseInt(Integer.java:786)
    at ExceptionHandlingDemo.handleExceptions(ExceptionHandlingDemo.java:12)
    at ExceptionHandlingDemo.main(ExceptionHandlingDemo.java:23)

Test Case 3:

Input:
Enter a string to convert to an integer: null

Output:
Enter a string to convert to an integer: null
NullPointerException: Attempted to operate on a null object.
java.lang.NullPointerException: Cannot invoke "String.length()" because "nullCheck" is null
    at ExceptionHandlingDemo.handleExceptions(ExceptionHandlingDemo.java:16)
    at ExceptionHandlingDemo.main(ExceptionHandlingDemo.java:23)*/