package interfacee;

public class Customer	
{
	String name;
	public Customer(String name)
	{
		this.name=name;
	}
	
	public void depositing(Bank bank ,double amount)
	{
		bank.depositing(amount);
	}
	public void withdrawing(Bank bank,double amount)
	{
		bank.withdrawing(amount);
	}
	public void ChekingAccountBalence(Bank bank)
	{
		System.out.println("current balence is "+bank.ChekingAccountBalence());
	}


}
/*Customer Class: A Customer class with attributes like name and accountBalance. This class will 
interact with the banks using the methods provided by the Bank interface.

Create the Customer class:
------------------------------

Attributes: name (String), accountBalance (double)
Methods: deposit(Bank bank, double amount), withdraw(Bank bank, double amount), checkBalance(Bank bank)
Demonstrate the loosely coupled architecture:

Create instances of SBI, HDFC, and ICICI bank classes.
Create a Customer instance.
Allow the customer to interact with each bank:


Note: Feel free to provide constructors and any additional methods required for the classes. You can adapt the question 
based on your preferences and the level of understanding you want to assess.
	*/