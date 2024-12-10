package OOP_Day_14;

public class Employee {
	
		private String  firstName  ; 
		private String   lastName  ;
		private int  employeeId;
		private double   salary ; 	
		private int  NoOfProject ;
		int pno;
	
	public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.NoOfProject = noOfProject;
	}
	
	public void  calculateSalary()
	{
		 pno=this.NoOfProject;
		if (pno<0)
		{
			System.out.println("enter the positive inpute");
			
		}
		else if(pno>=5 && pno<=10)
		{
			salary=salary+5000;
		}
		else if(pno>10 && pno<=20)
		{
			salary=salary+10000;
		}
		else if (pno>20)
		{
			salary=salary+15000;
			
		}
		
		}

	@Override
	public String toString() {
		if(NoOfProject>0)
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", NoOfProject=" + NoOfProject + "]";
		else
		{
			return "Error";
		}
	}
	
	

}
