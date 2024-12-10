package Oop_Day_11;

import java.util.Scanner;

public class Employee {
	int employeeId ;
	String employeeName;
	double employeeSalary; 
	
	public void show()
	{
		System.out.println("enete the empId :"+employeeId );
		System.out.println("enete the empName  :"+employeeName);
		System.out.println("enete the empId :"+employeeSalary );
	}
	public void setEmployeeData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the empId :");
		employeeId =sc.nextInt();
		sc.nextLine();
		System.out.println("enter the empName :");
		employeeName =sc.nextLine();
		System.out.println("enter the empId :");
		employeeSalary=sc.nextDouble();
		sc.close();
		
		
	}

	
}
