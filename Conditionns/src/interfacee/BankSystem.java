package interfacee;

public class BankSystem {


	public static void main(String []args)
	{
		HDFC h=new HDFC(1200);
		ICICI i=new ICICI(1300);
		SBI s=new SBI(1400);		
	
		
	
		Customer c=new Customer("gaurav");
		c.depositing(h, 200);
		//c.ChekingAccountBalence(i);
	}
		
}
