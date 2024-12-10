package New;
/*Ques - 1
Suppose you are tasked with developing a Java program to manage bank accounts for both savings and checking purposes. Your task is to implement classes for bank accounts, allowing customers to deposit money, withdraw funds, and earn interest on savings accounts.

SavingsAccount Class:

Develop a subclass SavingsAccount inheriting from the BankAccount class.
Include an additional instance variable interestRate to represent the annual interest rate.
Implement a method calculateInterest() to calculate and add interest to the account balance based on the interest rate.
   [interest = balance * interestRate / 100]
Ensure that the interest is added only for savings accounts.

CheckingAccount Class:

Create another subclass CheckingAccount inheriting from the BankAccount class.
This class does not have any additional functionality beyond the base class.

MainBank Class:

Develop a driver class named MainBank containing the main method to test the functionality of the bank account system.
Create instances of both SavingsAccount and CheckingAccount classes to represent different types of accounts.
Demonstrate the usage of deposit, withdraw, and interest calculation methods for savings accounts.
Example Output:


Previous Balance: 1000.0
Deposited: 200.0
Interest added: 10.0
Savings Account Balance: 1210.0

Previous Balance: 1000.0
Deposited: 300.0
Withdrawn: 100.0
Checking Account Balance: 1200.0 *
1)BankAccount Class:
*/
class bankAccount
{
	double  crbalence;
	bankAccount(int crbalence)
	{
		this.crbalence=crbalence;
	}
	public void deposit(double amount)
	{
		crbalence=crbalence + amount;
		System.out.println("deposit amout"+amount);
		System.out.println("current balence "+crbalence);
		
	}
	public void Withdrow(double amount)
	{
		if(crbalence >0 )
		{
			crbalence=crbalence+amount;
			System.out.println("deposit :"+amount);
		}
		else 
		{
			System.out.println("balence is unsufficient :");
		}
		
	}
}
class SavingAccounte extends bankAccount {
	double intRate;
	SavingAccounte(int crbalence,double intRate) {
		super(crbalence);
		this.intRate=intRate;
		
	}
	public void calculateintrest()
	{
		intRate = crbalence * intRate / 100;
		System.out.println("saving account balence is "+crbalence);
		
	}/*CheckingAccount Class:

Create another subclass CheckingAccount inheriting from the BankAccount class.
This class does not have any additional functionality beyond the base class.*/
	
}
class ChekingAccount extends bankAccount{

	ChekingAccount(int crbalence) {
		super(crbalence);
		
	}

}
public class MainBank {
	public static void main(String[] args) {
		SavingAccounte s= new SavingAccounte(25000,4);
		s.calculateintrest();
		s.deposit(120);
		s.Withdrow(250);
		ChekingAccount c=new ChekingAccount(25000);
		
		
	}
	

}
