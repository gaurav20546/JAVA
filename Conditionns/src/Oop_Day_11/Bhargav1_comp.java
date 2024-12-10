package Oop_Day_11;

import java.util.Scanner;

public class Bhargav1_comp {
	String CopName;
	double CopIncome;
	int comEmpcount;
	
	public void Getdata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the compny name :");
		CopName=sc.nextLine();
		System.out.println("enter the income :");
		CopIncome=sc.nextDouble();
		System.out.println("enter the empcount :");
		comEmpcount=sc.nextInt();
		sc.close();
		
		
	}
	
	public void showdata()
	{
		System.out.println("compny name is : "+CopName);
		System.out.println("compny income is  : "+CopIncome);
		System.out.println("compny emp count is : "+comEmpcount);
	}

}
