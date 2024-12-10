package mutipleinheritance;


public class manager extends employee {
	String Department;
	manager(String name, int age,String empid,String Department)
	{
		
		super(name,age,empid);
		this.Department=Department;
				
	}
	public void display()
	{
		super.dispemp();
		System.out.println("department is"+Department);
	}
	


}
