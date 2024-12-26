package TryCatchBlock;
import java.util.Scanner;
public class missMatchEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter the  number :");
			int a=sc.nextInt();
			System.out.println("enter the second number :");
			int b=sc.nextInt();
			System.out.println("num a:"+a +"num b:"+b);
			
		}
		catch (Exception e) {
			System.out.println("An "+e+" occurred.");
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.toString());
			
		}
		finally {
			sc.close();
		}
	}

}
/*Ques - 1
-------------
Exception and Messages 

a. Write a program to create an ELC class SimpleExceptionDemo ,which contains main method.

b. This program should read two integer numbers for the variables a and b from console using Scanner class.

c. If you enter any other character except number (0 - 9) then the error is caught by InputMisMatchException object.

d. After that using following methods print the information about the error occurring causes in the console. getMessages(),  printStackTrace(), println(),  toString().


Test Cases
Test Case 1:
Enter the first integer (a): 10
Enter the second integer (b): 20

Output:
You entered a = 10 and b = 20
Test Case 2:


Enter the first integer (a): 10
Enter the second integer (b): abc
Output:
Enter the first integer (a): 10
Enter the second integer (b): abc
An InputMismatchException occurred.
Message: null
String representation: java.util.InputMismatchException
Stack trace: 
java.util.InputMismatchException
    at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at SimpleExceptionDemo.main(SimpleExceptionDemo.java:10)  */