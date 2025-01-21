package multiiThreading;

public class Depositer extends Thread{
	
	private Account account;

	public Depositer(Account account) 
	{
		super();
		this.account = account;
	} 
	
	@Override 
	public void run()
	{
		int deposites[] = {100,300};
		for(int integers:deposites)
		{
			account.deposite(integers);
		}
	}

}
