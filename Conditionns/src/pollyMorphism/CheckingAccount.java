package pollyMorphism;
/*ubclass - CheckingAccount:

Create a subclass named CheckingAccount that extends the Account class.
Add an additional attribute:
overdraftLimit (double): Represents the overdraft limit for the checking account.
Implement a parameterized constructor to initialize the attributes of both the Account class and the CheckingAccount class.

Override the generateStatement(): Similarly, in the CheckingAccount subclass, the generateStatement()
 method is overridden to prints the account number, current balance, and the overdraft limit for the 
 checking account. It also utilizes the covariant return type to return a CheckingAccount object.*/
public class CheckingAccount extends Account{
	double overdraftLimit;

	public CheckingAccount(String accountNo, double balence, double overdraftLimit)
	{
		super(accountNo, balence);
		this.overdraftLimit = overdraftLimit;
	}
	
	CheckingAccount()
	{
		super();
	}
	
	@Override
	public Account generateStatement()
	{
		System.out.println(""+getaccountNo());
		System.out.println(""+balence);
		System.out.println("overdraftLimit"+overdraftLimit);
		return new CheckingAccount();
		
		
	}

}
