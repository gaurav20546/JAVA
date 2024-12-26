package interfacee;

public class HDFC implements Bank {

	private double Hacountalence;
	
	public HDFC(double initialB)
	{
		this.Hacountalence=initialB;
	}
	@Override
	public void depositing(double amount)
	{
		
		this.Hacountalence+=amount;
		System.out.println("creadete succufully "+amount+"balence is "+Hacountalence);
		
	}

	@Override
	public void withdrawing(double amount) {
		if(Hacountalence>amount)
		{
			this.Hacountalence=Hacountalence-amount;
			System.out.println("debited succusfully :"+amount);
		}
		else 
		{
			System.out.println("balence not suuficent");
		}
		
	}

	@Override
	public double ChekingAccountBalence() 
	{
		
		return Hacountalence;
	}

}
