package pollyMorphism;

public class HospitalStaff {
	private String name;
	private int age;
	private String role;
	HospitalStaff(String name,int age ,String role)
	{
		this.name=name;
		this.age=age;
		this.role=role;
		
		
	}
	
	public void work()
	{
		System.out.println("Role :"+name);
		System.out.print("its working ");
		System.out.println("role :"+role);
	}
	
}
