package pollyMorphism;
/*Program 02
----------
Scenario: Banking Account Management System

Base Class - Account:

Create a class named Account with the following attributes:
accountNumber (String): Represents the account number.
balance (double): Represents the current balance.
Implement a parameterized constructor to initialize the attributes.
Include getter methods for accountNumber and balance.

Implement methods:
generateStatement() : The generateStatement() method in the Account class serves as a generic statement generator for all types of accounts. It prints a message with the account number and current balance. The covariant return type is used to return an Account object. 
8*/
public class Account {
	private String accountNo;
	double balence;
	Account(String accountNo,double balence)
	{
		this.accountNo=accountNo;
		this.balence=balence;
		
	}
	 Account()
	{
		super();
	}
	
	public String  getaccountNo()
	{
		return accountNo;
		
	}
	public Account generateStatement()
	{
		System.out.println(""+accountNo);
		System.out.println(""+balence);
		return new Account();
		
		
	}
}
