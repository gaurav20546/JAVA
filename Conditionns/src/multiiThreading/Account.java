package multiiThreading;

public class Account
{
	private int balence=0;
	
	public synchronized void withdraw(int amount)
	{
		System.out.println("go to withdraw");
		if(this.balence<amount)
		{
			System.out.println("balence is not suffiseant .please wait few second...");
			try {
				wait(1000);
				System.out.println("notify mess recived..");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.balence=this.balence-amount;
		System.out.println("avalble balence is "+balence);
	}
	
	public synchronized void deposite(int amount)
	{
		System.out.println("we are going to deposite amount...");
		if(amount>0)
		{
			this.balence=this.balence+amount;
			System.out.println("amout deposite succsfully...balence is "+this.balence);
		
			notify();
		}
	}
}
