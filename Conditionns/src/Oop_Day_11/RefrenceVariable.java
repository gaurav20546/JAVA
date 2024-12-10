package Oop_Day_11;
/* Parameter Variable :
 * It is a method level variable hence does not have default value.
 * If a variable is declared inside a method parameter(int )->called parameter varible 
 * End user is responsible to initialize the parameter variable.
 */
public class RefrenceVariable {
	int employeeId;
	String employeeName;
	double empoyeeSalary;
	String empAddress;
	public void setEmployeeData(int id, String name, double sal, String addr)
	{
			employeeId = id;
		   employeeName = name;
		   empoyeeSalary = sal;
		   empAddress = addr;
		
	}
	public void getEmployeeData()
	{
		System.out.println("Employee Id is :"+employeeId);
		   System.out.println("Employee Name is :"+employeeName);
		   System.out.println("Employee Salary is :"+empoyeeSalary);
		   System.out.println("Employee Address is :"+empAddress);
		
	}
}
