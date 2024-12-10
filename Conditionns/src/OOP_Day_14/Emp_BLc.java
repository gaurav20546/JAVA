package OOP_Day_14;

public class Emp_BLc 
{
	
	public int  employeeNo;
	public String  firstName  ; 
	public double  salary ;
	
	public Emp_BLc(int employeeNo, String firstName, double salary)
	{
		super();
		if(employeeNo>0 && firstName != null  && salary>0)
		{
		this.employeeNo = employeeNo;
		this.firstName = firstName;
		this.salary = salary;
		}
		else 
		{
			System.out.println("eroor");
			System.exit(0);
		}
	}
//	public double salary()
//	{
//		return salary;
//	}

	

}
