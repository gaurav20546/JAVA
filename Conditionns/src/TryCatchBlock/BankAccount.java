package TryCatchBlock;

public class BankAccount implements Bank
{
	private long accountNumber;
	private double balence=50000;
	
	@Override
	public void deposit(double amount) throws InvalidAmountException
	{
		if(amount>=0)
		{
		this.balence=balence+amount;
		System.out.println(amount+"deposite succusfully ! your balence is "+balence);
		}
		else {
			throw new InvalidAmountException("Invalid Amount you Entered !");
		}
	}
	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		
		if(amount<=0)
		{
			throw new InvalidAmountException ("amount is not invalid");
		}
		else if(amount>balence)
		{
			throw new InsufficientFundsException ("insufficient fund !");
		}
		else {
			this.balence=balence-amount;
		}
	}
	@Override
	public void transfer(BankAccount toaccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
		
		if(amount>balence)
		{
			throw new InsufficientFundsException("insufficient fund !");
		}
		else if(this.accountNumber == toaccount.accountNumber)
		{
			throw new AccountNotFoundException("target Account not Found !");
		}
	}
	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException 
	{
		if(amount>100000)
		{
			throw new LoanNotAllowedException("you exceed the limit ");
		}
		else if(amount<=0)
		{
			throw new InvalidAmountException ("amount is invalid for applying loan");
		}
	}
	@Override
	public double getBalence() {
		
		return this.balence;
	}

}
