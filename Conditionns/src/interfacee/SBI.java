package interfacee;

public class SBI implements Bank {

	private double acountB;
	
	public SBI(double balence)
	{
		this.acountB=balence;
	}
	@Override
	public void depositing(double amount) {
		this.acountB+=amount;
		System.out.println("SBI: Deposited " + amount);
	}

	@Override
	public void withdrawing(double amont)
	{
		if(acountB >=amont)
		{
		this.acountB=acountB-amont;
		System.out.println("SBI: Withdrawn " + amont);
		}
		else
		{
			System.out.println("SBI: Insufficient balance!");
		}
	}

	
	@Override
	public double ChekingAccountBalence() {
	
		return acountB;
	}

}
