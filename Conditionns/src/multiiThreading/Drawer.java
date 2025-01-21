package multiiThreading;

public class Drawer extends Thread 
{
	private Account account;

	public Drawer(Account account) 
	{
		super();
		this.account = account;
	}
	
	@Override
	public void run()
	{
		int withdrawals [] = {1,2,3};
		
		for(int integers:withdrawals)
		{
			account.withdraw(integers);
			
		}
	}

}
