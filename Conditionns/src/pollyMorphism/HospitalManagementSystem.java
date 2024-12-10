package pollyMorphism;

public class HospitalManagementSystem {
	public static void main(String[] args) 
	{
		HospitalStaff H=new  HospitalStaff("gaurav",21,"develpoer");	
		H.work();
		System.out.println("Doctor------------------------");
		Doctor d=new Doctor("Gaurav",25,"mbbs","ff");
		d.work();
		System.out.println("Nurse---------------------------");
		Nurse n=new Nurse("janhvi",22,"chekk",2);
		n.work();
		
	}

}
