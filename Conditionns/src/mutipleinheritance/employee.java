package mutipleinheritance;

public class employee extends person {
	String empid;
	
	employee(String name, int age,String empid)
	{
		super(name, age);
		this.empid=empid;
		
	

	}
	public void dispemp()
	{
		super.displayp();
		System.out.println("emploid :"+empid);
	}

	
}
