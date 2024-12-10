package pollyMorphism;
/*
ELC - BankManagementSystem:

Create an ELC named BankManagementSystem that:
Instantiates a SavingsAccount object with sample data.
Invokes methods on the SavingsAccount object to demonstrate the generation of a savings account statement.
Instantiates a CheckingAccount object with sample data.
Invokes methods on the CheckingAccount object to demonstrate the generation of a checking account 
statement.*/


public class MainAccount
{
	public static void main(String [] args)
	{
		SavingsAccount a=new  SavingsAccount("125489545",25000,25);
		a.generateStatement();
		
		System.out.println("----------------------------------------");
		
		CheckingAccount c=new CheckingAccount("45854556",55455,458);
		c.generateStatement();
		
		
	}

}
