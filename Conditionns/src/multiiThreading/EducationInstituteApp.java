package multiiThreading;

public class EducationInstituteApp {
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		//EducationInstituteApp E =new EducationInstituteApp();
		
		Course c1=new Course(1,"HTML",23000);
		Course c2=new Course(2,"Java",23000);
		Course c3=new Course(3,"Python",23000);
		
		Offer o1=new Offer("By 2 get 1 free");
		Offer o2=new Offer("New year discount 2000-OFF");

		Course [] corse = {c1,c2,c3};
		Offer[] offers= {o1,o2};
		
		EducationInstitute E= new EducationInstitute(corse,offers);
		
		student rutuja =new student("gaurav",E);
		student gaurav =new student("Rutuja",E);
		
		
		Thread t1 = new Thread()
		{
	      @Override
	      public void run()
	      {
	    	  System.out.println("Available Courses and Fees :");
		    	 rutuja.viewCoursesAndFees();
		    	 System.out.println("Available Offers :");
		    	 rutuja.viewOffers();
		    	 rutuja.enrollInCourse(1);
		    	 
	    	 
	      }
		};
		
		Thread t2=new Thread()
				{
			@Override
			public void run()
			{
				System.out.println("Avalable courses and Fees :");
				gaurav.viewCoursesAndFees();
				System.out.println("Avalable offerse :");
				gaurav.viewOffers();
				gaurav.enrollInCourse(2);
			}
			
			};
			
			try {
				t1.start();
				t1.join();
				System.out.println("=========================================================");
				
				t2.start();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
/*class Main :



The EducationInstituteApp class is the main program that simulates concurrent student interactions
 using threads. 

It creates an education institute, initializes students, and allows them to view course details, 
ongoing offers, and enroll in courses concurrently without disturbing the execution flow of each 
							thread.



Instructions for Students:

-> Implement the above classes and their methods following the given specifications.

-> Create an instance of EducationInstitute, and initialize courses and offers with hardcoded data for simplicity.

-> Create two students: Virat and Dhoni. Allow them to view available courses, check ongoing offers,
 and enroll in their preferred courses concurrently using threads.

-> Use the Thread class to simulate concurrent student interactions. Ensure that the system provides
 a responsive user experience for multiple students.

-> Test your program with multiple executions and verify that students can view course details, 
offers, and enroll without conflicts.

-> Feel free to enhance the program with additional features or error handling to further improve 
its functionality.



[Note : Include appropriate comments and use meaningful variable names to make your code more
 readable and understandable.]



Sample Output :



Available Courses:

1. Mathematics - Fee: Rs.1000.0

2. Science - Fee: Rs.1200.0

3. English - Fee: Rs.900.0

Ongoing Offers:

Special discount: Get 20% off on all courses!

Limited time offer: Enroll in any two courses and get one course free!

Virat has enrolled in the course: Mathematics



Available Courses:

1. Mathematics - Fee: Rs.1000.0

2. Science - Fee: Rs.1200.0

3. English - Fee: Rs.900.0

Ongoing Offers:

Special discount: Get 20% off on all courses!

Limited time offer: Enroll in any two courses and get one course free!

Dhoni has enrolled in the course: Science*/