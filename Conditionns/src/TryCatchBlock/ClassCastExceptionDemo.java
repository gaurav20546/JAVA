package TryCatchBlock;

import New.maintheater;

public class ClassCastExceptionDemo {
	public static void handleClassCastException() {
		Object[] objects={" Gaurav",123 ,"yash "};
		try {
			for(Object obj:objects )
			{
				String s=(String) obj;
				System.out.println("Casting succusfully :"+s);
			}
			
		}
		catch(ClassCastException e)
		{
			System.err.println("Cannot cast java.lang.Integer to String.");
			System.out.println(e.toString());
			
		}
			
	}

	public static void main(String [] args)
	{
		handleClassCastException();
	}
}
/*-------------
Instructional Question: Handling ClassCastException in Java
Objective:
Write a Java program that demonstrates how to handle ClassCastException. The program should include a method that attempts to cast an object of one type to another incompatible type. If a ClassCastException occurs, it should be caught and an appropriate message should be displayed.

Instructions:
Create a class named ClassCastExceptionDemo:

Implement a static method handleClassCastException :
Access Modifier : public
Non-Access Modifier : static
return type : void
parameters : No-Param

Declares an array of Object type and initializes it with some values of different types.
Attempts to cast each element of the array to String.
Use a try block to perform the casting.
Catch ClassCastException and print an appropriate message along with the stack trace.
Create a main method:

Inside the main method, call the handleClassCastException method.
Test the program:

Write a test case where you attempt to cast objects of different types to String.

Test Case 1: Successful Casting
Input:
Objects: {"Hello", "World", "Java"}
Expected Output:
Casting successful: Hello
Casting successful: World
Casting successful: Java


Test Case 2: Unsuccessful Casting
Input:
Objects: {"Hello", 123, "Java"}
Expected Output:
Casting successful: Hello
ClassCastException: Cannot cast java.lang.Integer to String.
java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
    at ClassCastExceptionDemo.handleClassCastException(ClassCastExceptionDemo.java:14)
    at ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:26)*/