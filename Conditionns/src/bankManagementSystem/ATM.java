package bankManagementSystem;

import java.util.Scanner;

public class ATM {
	private User currentUser;
	
	public void login(BankSystem bankSystem)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user Id :");
		String userId=sc.nextLine();
		System.out.println("Enter user pin :");
		String userPin=sc.nextLine();
		
		User user=bankSystem.validateUser(userId,userPin);
		if(user !=null)
		{
			currentUser=user;
			System.out.println("login succusfully :");
		}
		else 
		{
			System.out.println("Invalid Details.Try again.");
		}
	}
	public void showMenu()
	{
		if(currentUser==null)
		{
			System.out.println("Log in fisrt .");
			return;
		}
		Scanner sc=new Scanner(System.in);
		int choise;
		do {
		System.out.println("-----ATM--MENU-----");
		System.out.println("1 Transction Histroy ");
		System.out.println("2 Withdraw Amount ");
		System.out.println("3 Deposit  Amount ");
		System.out.println("4 Transfer Amount ");
		System.out.println("5 Quite           ");
		
		choise=sc.nextInt();
		switch(choise)
		{
		case 1:currentUser.showTransaction();
			break;
			
		case 2:withdraw();
			break;
		
		case 3:deposit();
			break;
		
		case 4:transfer();
			break;
		
		case 5:System.out.println("Thank You for using the ATM .");
			break;
			
		default:System.out.println("Invalid Choise .Try again .");
		}
		}while (choise !=5);
	}
		
	private void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the withdraw amount :");
			double amount =sc.nextDouble();
			if(amount>0 && amount<= currentUser.getBalence())
			{
				currentUser.updateBalence(-amount);
				currentUser.Addtranscation("withdraw :$"+amount);//transaction histroy add 
				System.out.println("withdraw sucussful.New Balence:$"+currentUser.getBalence());
			}
			else
			{
				System.out.println("insufficient funds .");
			}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the deposit amount :");
			double amount =sc.nextDouble();
			if(amount>0 )
			{
				currentUser.updateBalence(amount);
				currentUser.Addtranscation("deposit :$"+amount);//transaction histroy add 
				System.out.println("deposit sucussful.New Balence:$"+currentUser.getBalence());
			}
			else
			{
				System.out.println("invalid amoun .");
			}
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
			public void transfer()
			{
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the reciver ID :");
				String reciverId=sc.nextLine();
				
				System.out.println("Enter the Transfer amount ");
				double amount=sc.nextDouble();
				
				if(amount >0  && amount <= currentUser.getBalence())
				{
					currentUser.updateBalence(-amount);
					currentUser.Addtranscation("Transfererd $:"+amount +"to user ID :"+reciverId);
					System.out.println("Transfer amount succusful .New balence :$"+currentUser.getBalence());
					
				}
				else 
				{
					System.out.println("Insufficient funds .");
				}
				
			}
			
		
}
	


