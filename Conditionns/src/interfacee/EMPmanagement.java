package interfacee;

import java.util.Scanner;

public class EMPmanagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EMP Id ");
		int id=sc.nextInt();
		if(id>0)
			
			
		{
		System.out.println("enter the EMP name :");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("enter the EMP salary :");
		double sal=sc.nextDouble();
		System.out.println("enter the benifit :");
		double ben=sc.nextDouble();
		
		Employee e=new FullTimeEmployee(id,name,sal,ben);
		e.generatePayroll();
		System.out.println("total sal:"+e.calculateSalary());
		}
		else 
			System.err.println("enter posititve value :");
	}

}
/*Take a main clas  Employee Management System.
Create instances of  FullTimeEmployee.
Call the calculateSalary() and generatePayroll() methods to ensure correct calculations and information generation.

Test Case 1 : 
--------------
for Negative Salary
Sample Input:
if user eneterd negative salary

Expected Output :
Error: Monthly salary cannot be negative.
*/