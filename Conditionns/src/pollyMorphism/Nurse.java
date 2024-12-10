package pollyMorphism;

public class Nurse extends HospitalStaff{
	private int yearsOfExperience;
	Nurse(String name, int age, String role, int yearsOfExperience) {
		super(name, age, role);
		this.yearsOfExperience=yearsOfExperience;
	}
	@Override
	public void work()
	{
		super.work();
		System.out.println("yearsOfExperience :"+yearsOfExperience);
	}

}
