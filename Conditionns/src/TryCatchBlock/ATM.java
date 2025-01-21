package TryCatchBlock;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		BankAccount b= new BankAccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Select an option :\r\n"
				+ "           1. Deposit\r\n"
				+ "           2. Withdraw\r\n"
				+ "           3. Transfer\r\n"
				+ "           4. Loan Application\r\n"
				+ "           5. Check Balance\r\n"
				+ "           6. Exit"
				+ "Enter the operation");
		int op=sc.nextInt();
		switch(op)
		{
		case 1:{
			System.out.println("Enter the amount for deposite :");
			double amount=sc.nextDouble();
			b.deposit(amount);
			
			
			
		}
		}
	}

}
