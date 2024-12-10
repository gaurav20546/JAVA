package OOP_Day_13;

public class Bank_BLC {

	private String bankName;
	private String bankCustomerName;
	private String bankAddress;
	private String bankIFSCCode;
	private double  customerAccountNumber;
	private double currentBalance;
	
	public void setDetails(String bankName,String bankCustomerName,String bankAddress,String bankIFSCCode,double customerAccountNumber,double currentBalance)
	{
		this.bankName=bankName;
		this.bankCustomerName=bankCustomerName;
		this.bankAddress=bankAddress;
		this.bankIFSCCode=bankIFSCCode;
		this.customerAccountNumber=	customerAccountNumber;
		this.currentBalance=currentBalance;
	}
	public void withdrow(double amt)
	{
		if(currentBalance<=1000 )
		{
			System.out.println(" InsufficientBalanc ");
		}
		
		else if (currentBalance>1000)
		{
			currentBalance=currentBalance-amt;
			System.out.println("avalaable balence is "+currentBalance);
			if(currentBalance<1000)
			{
				System.out.println("maintain the balence :");
		
			}
			else 
			{
				System.out.println("Transaction Succusful !");
			}
		}
		
			
	}
	public void deposit(double dep)
	{
		currentBalance=currentBalance+dep;
		System.out.println("deposit succfully ");//\n "+"avalable Balence is:"+currentBalance);
		currentBalance();
	}
	public void currentBalance()
	{
		System.out.println("cuurent balence "+currentBalance);
	}
	public void displayDetails()
	{
		System.out.println("Bank name is "+bankName);
		System.out.println("bank customer name is :"+bankCustomerName);
		System.out.println("bankAddress"+bankAddress);
		System.out.println("user IFC code "+bankIFSCCode);
		System.out.println("customer account number "+customerAccountNumber);
		System.out.println("current balence is "+currentBalance);
		
	}
}
