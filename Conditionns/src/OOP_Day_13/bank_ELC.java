package OOP_Day_13;

import java.util.Scanner;

public class bank_ELC {
	public static void main(String[] args) {
		Bank_BLC B=new Bank_BLC();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the bank name :");
		String bankName=sc.nextLine();
		
		System.out.println("enter your name :");
		String bankCustomerName=sc.nextLine();
		
		System.out.println("enter your bank addres :");
		String bankAddress=sc.nextLine();
		
		System.out.println("enter your bank ifc code  :");
		String bankIFSCCode=sc.nextLine();
		
		System.out.println("enter your account no");
		double customerAccountNumber=sc.nextDouble();
		//double currentBalance=1000;
		System.out.println("current ballence is ");
		double currentBalance=sc.nextDouble();
		
		B.setDetails(bankName,bankCustomerName, bankAddress, bankIFSCCode, customerAccountNumber, currentBalance);
		
		
		
		
		System.out.println("enter your withdoraw ammount :");
		double amt=sc.nextDouble();
		B.withdrow(amt);
		
		System.out.println("enter your Diposit ammount :");
		double dep=sc.nextDouble();
		B.deposit(dep);
		B.currentBalance();
		B.displayDetails();
		
		sc.close();
				
	}
}
