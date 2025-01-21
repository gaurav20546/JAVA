package TryCatchBlock;

public interface Bank {
	public void deposit(double amount) throws InvalidAmountException;
	
	public void withdraw(double amount)throws InsufficientFundsException;
	
	public void transfer(BankAccount toaccount,double amount ) throws InsufficientFundsException,AccountNotFoundException,InvalidAmountException;
	
	public void applyForLoan(double amount)throws LoanNotAllowedException,InvalidAmountException;
	
	public double getBalence();
}
