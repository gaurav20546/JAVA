package interfacee;

public class ICICI implements Bank
{
	private double ICbalence;
	
	public ICICI(double initialB)
	{
		this.ICbalence=initialB;
	}

	@Override
	public void depositing(double amount ) {
		this.ICbalence+=amount;
		System.out.println("amount deposite succusfully :"+amount);
		
		
	}

	@Override
	public void withdrawing(double amount) {
		if(ICbalence>amount)
		{
			this.ICbalence=ICbalence-amount;
			System.out.println("debited succusfully :"+amount);
		}
		else 
		{
			System.out.println("balence not suuficent");
		}
		
	}

	@Override
	public double ChekingAccountBalence() {
		return ICbalence;
		
	}

}
