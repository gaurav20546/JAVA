package TryCatchBlock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the forst no :");
			int no1= sc.nextInt();
			System.out.println("Enter the second no :");
			int no2 = sc.nextInt();
			System.out.println("NO1 :"+no1+ "\n1"
					+ " NO2 :"+no2);	
			
		}
		catch(InputMismatchException e) 
		{
			System.out.println("enter the integer :");
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.toString());
			
		}
	}

}
/*-----------------
EXCEPTION HANDLING LAB EXERCISE STAGE-1
========================================
1. Exception and Messages…
a. Write a program to create a class ‘SimpleExceptionDemo’ ,which implements main method.
b. This program should read two integer numbers for the variables a and b from console using Scanner class.
c. If you enter any other character except number (0 - 9 ) then the error is caught by InputMisMatchException object.
d. After that using following methods print the information about the error occurring causes in the console. getMessages() printStackTrace() println() 


----------------------------------------------------------------------
*/