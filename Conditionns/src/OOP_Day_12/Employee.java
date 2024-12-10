package OOP_Day_12;

public class Employee {
	
	String EmpName;
	String EmpLastName;
	double salary;
	int  EmpId;
	int NoOfProject;
	
	public void setEmployeeData(String EmpName,String EmpLastName,double salary,int EmpId,int NoOfProject)
	{
		this.EmpName=EmpName;
		this.EmpLastName=EmpLastName;
		this.salary=salary;
		this.EmpId=EmpId;
		this.NoOfProject=NoOfProject;
		
	}
	public void setSalary()
	{
		if(NoOfProject>5 && NoOfProject<=10)
		{
			salary=salary+5000;
		}
		
		else if(NoOfProject>10 && NoOfProject<=20)
		{
			salary=salary+10000;
		}
		else 
		{
			salary=salary+15000;

		}
		
		
	}
	public void showData()
	{
		System.out.println("Emp Fiest name is "+EmpName);
		System.out.println("Emp last name is "+EmpLastName);
		System.out.println("Emp salary is "+salary);
		System.out.println("Emp id "+EmpId);
		System.out.println("no if "+NoOfProject);
		
	}
	

}
