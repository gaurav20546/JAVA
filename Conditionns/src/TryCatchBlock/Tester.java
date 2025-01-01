package TryCatchBlock;

public class Tester {
	public static void main(String[] args) {
		parentClass E=new ChildClass();
		E.loadingClass("java.lang.String");
		
	}

}
/*Create a ELC class Tester and implement the main method:

Inside the main method, create an instance of ChildClass and call the overridden loadingClass method with various test inputs.
Take the input from command line.
Use a try-catch block to catch and handle the exceptions.


Test Case 1: Valid class name
Input: java.lang.String
Expected Output:
Class loaded successfully: java.lang.String8? */