package multiiThreading;

public class Account
{
	private int balence=0;
	
	public synchronized void withdraw(int amount)
	{
		System.out.println("go to withdraw");
		if(this.balence>=amount)
		{
			
		}
	}
}
