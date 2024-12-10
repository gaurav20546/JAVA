//--------------------------------------------------------------------------------------------
//Program 3 : (Points 10)Single level Inheritance 
//----------------------------------------------------------------------------------------------
//Consider a scenario where you are designing a class hierarchy to handle basic and advanced calculations
//. The base class, CalculationBase, has two variables, num1 and num2, and a method performCalculation() that adds these two numbers. 
//The subclass, AdvancedCalculation, extends the base class, introduces two additional variables, additionalNum and operation, and has a method performAdvancedCalculation() that 
//performs a more complex operation using all four numbers.
//
//Your task is to implement and test this class hierarchy. Follow the instructions below:
//
//CalculationBase class:
//
//Include two variables, int num1 and int num2.
//Implement a default constructor and a parameterized constructor to initialize these variables.
//Create a method called performCalculation() that adds num1 and num2 and displays the result.
//
//AdvancedCalculation class:
//
//Extend the CalculationBase class.
//
//Introduce two additional variables, double additionalNum and String operation.
//
//Implement a default constructor and a parameterized constructor to initialize all four variables.
//
//Create a method called performAdvancedCalculation() that uses all four numbers to perform a complex operation. Display the result along with the details of the operation.
//
//In the Main class:
//
//Create an instance of the AdvancedCalculation class, setting values for all variables.
//Demonstrate the use of the performCalculation() method inherited from the superclass.
//Demonstrate the use of the performAdvancedCalculation() method from the subclass.

package Multiple_inheritance;
class calculation 
{
	int num1;
	int num2;
	calculation(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void performCalculation()
	{
		System.out.println("additiob:"+num1+num2);
	}
}
class AdvancedCalculation extends calculation
{	double additionnum;
	String operation ;
	AdvancedCalculation(int num1,int num2,String operation)
	{
		super(num1,num2);
		this.additionnum=additionnum;
		this.operation=operation;
		
	}
	
	public double erformAdvancedCalculation(String operation)
	{
		if(operation=="+")
		{
			additionnum=num1+num2;
			
		}
		else if(operation=="-")
		{
			additionnum=num1*num2;
		}
		return additionnum;
	}

}

public class Calculator {

	public static void main(String[] args) {
		AdvancedCalculation a=new AdvancedCalculation(12,5,"+");
		

	}
	
}

//----------------------------------------------------------------------------------------------------
//Program 4 : (points 10) )Hierarchical Inheritance
//-----------------------------------------------------------------------------------------------------
//You are tasked with modeling a simple banking system using Java classes. Implement three classes: BankAccount, SavingsAccount, and CheckingAccount.
//
//BankAccount Class:
//
//Attributes:
//
//int accountNumber: Represents the account number.
//double balance: Represents the current balance in the account.
//
//create Parametrized constructor to initialize Instance Variables
//
//Methods:-
//
//1)method name:- deposite
//Return Type:- void
//parameter: double amount
//this method Adds the specified amount to the balance.
//
//2)method name:- withdraw
//Return Type:- void
//parameter: double amount
//
//Subtracts the specified amount from the balance if sufficient funds are available; otherwise, prints "Insufficient funds."
//
//SavingAccount class:-
//
//extends from BankAccount.
//
//Additional Attributes:
//double interestRate: Represents the interest rate for the savings account.
//
//create Parametrized constructor to initialize Instance Variables
//
//
//Methods:-
//
//1)method name:- addInterest
//Return Type:- void
//parameter: NO
//this method Adds interest to the balance based on the interest rate.
//
//CheckingAccount Class:
//
//extends from BankAccount.
//
//Additional Attributes:
//
//double overdraftLimit: Represents the overdraft limit for the checking account.//3000
//
//create Parametrized constructor to initialize Instance Variables
//
//Methods:-
//
//void withdraw(double amount): Subtracts the specified amount from the balance if it does not exceed the overdraft limit(3000); otherwise, prints "Exceeds overdraft limit."
//
//
//create main class to test your logic

