package interfacee;

public class MyCalculator implements AdvancedArithmetic
{
	
	@Override
	public int divisorSum(int div) {
		int sum=0;
		if(div>0)
		{
			for(int i=1;i<=div;i++)
			{
				if(div % i==0)
				{
				 sum+=i;
				}
			}
		}
		else 
		{
			System.out.println("enter the positive number");
			System.exit(0);
		}
		return sum;
	}
	
}
/* 
Then write a class called MyCalculator which implements the interface AdvancedArithmetic. 

divisorSum function just takes an integer as input and return the sum of all its divisors.

For example divisors of 6 are 1,2,3 and 6, so divisorSum should return 12. 

Sample Input 
6 
Sample Output 
12 
Explanation 
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12. 
A class Testing is given to you with a main method. Use this class to test your solution's classes and meth
ods.


Example :
-----------
Test Case 1 : 
--------------
Sample Input: 6

Expected Output:*/