package interfacee;

public class FullTimeEmployee implements Employee 
{
	private int employeeId     ;
	private String employeeName;
	private double monthlySalary ;
	private double benefits;
	
	FullTimeEmployee(int employeeId, String employeeName,double monthlySalary,double benefits)
	{
		if(monthlySalary>0 && employeeId>0 )
		{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.monthlySalary=monthlySalary;
		this.benefits=benefits;
		}
		else 
		{
			System.err.println("enter must be positive detais");
			System.exit(0);
		}
	}
	@Override
	public double calculateSalary()
	{
		monthlySalary=monthlySalary+benefits;
		return monthlySalary;
		
	}
	@Override
	public void generatePayroll()
	{
		System.out.println("emp Name :"+employeeName);
		System.out.println("empId :"+employeeId);
		System.out.println("empSal :"+monthlySalary);
		System.out.println("benefits :"+benefits);
	}


}/*
FullTimeEmployee Class :

Implement a class named FullTimeEmployee that implements the Employee interface.

Include Attributes :
employeeId     	:(int)
employeeName   	:(String)
monthlySalary 	:(double) 
benefits 			:(double)

Acess modifier :private(for all the varriable )

Provide a constructor that initializes the employee details.

Implement the calculateSalary() method to calculate the salary for a full-time employee, including benefits.

Implement the generatePayroll() method to print the payroll information for a full-time employee.

Testing :*/
