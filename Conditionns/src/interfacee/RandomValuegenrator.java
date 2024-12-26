package interfacee;
import java.util.Random;
import java.util.function.Supplier;

public class RandomValuegenrator {

	

	public static void main(String[] args) {
		Supplier<String> s =() ->
		{
			Random r = new Random();
			int n = r.nextInt(1000, 9999);
			return "NIT"+n;
		};
		Supplier<Integer> s1= ()->
		{
			Random r = new Random();
			int n = r.nextInt(1, 1000);
			return n;
		};
		System.out.println("Generated random string:"+s.get());
		System.out.println("Generated random integer:"+s1.get());
	}

}
/*Create a Java program that utilizes the Supplier interface to generate random values. Implement two Supplier instances: one for generating a random alphanumeric string in the format "NIT" followed by four random digits, and another for generating a random integer within a specified range.

RandomValueGenerator class(ELC):

Inside the main method, define two consumers:
String Supplier (stringSupplier):
Generates a random alphanumeric string in the format "NIT" followed by four random digits.
Example output: "NIT1234", "NIT5678", etc.n

Integer Supplier (integerSupplier):
Generates a random integer between a specified minimum and maximum value (inclusive).
Example output: 57, 92, etc.

Tasks to Implement:
Define the stringSupplier and integerSupplier instances using the Supplier interface and lambda expressions.

Inside the main method, use these suppliers to generate random values and print the results.

Test Cases:

Test Case 1:
Output:
Generated random string: NIT1234
Generated random integer: 57

Test Case 2:
Output:
Generated random string: NIT5678
Generated random integer: 92

Test Case 3:

Output:
Generated random string: NIT0192
Generated random integer: 14

*/
