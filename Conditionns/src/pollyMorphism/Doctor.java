package pollyMorphism;

public class Doctor extends HospitalStaff{
	private String  specialization;
	Doctor(String name,int age ,String role,String specialization)
	{
		super(name,age,role);
		this.specialization=specialization;
	}

	@Override
	public void work()
	{
		super.work();
		System.out.println("Specializaton :"+specialization);
	}
	

}
