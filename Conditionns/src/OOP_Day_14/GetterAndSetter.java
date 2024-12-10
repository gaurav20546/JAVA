package OOP_Day_14;

public class GetterAndSetter {
	private double empSalary;
	public GetterAndSetter(double empSalary)
	{
		super();
		this.empSalary=empSalary;
	}
	public double getempSalary()                                             
	{
		return this.empSalary;
	}
	public void setempSalary(double empSalary) 
	{
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "GetterAndSetter [empSalary=" + empSalary + "]";
	}

}
