package multiiThreading;

class student{
	private String name;
	private EducationInstitute institute ;
	
	
	
	public student(String name, EducationInstitute institute)
	{
		super();
		this.name=name;
		this.institute=institute;
	}
	public void viewCoursesAndFees()
	{
		Course arr[] =institute.getcourses();
		for(Course c:arr)
		{
			System.out.println(c.getCourseId()+":"+c.getCourseName()+":"+c.getCorseFee());
		}
	}
	public void viewOffers()
	{
		Offer off[] =institute.getoffers();
		for(Offer p:off)
		{
			System.out.println(p.offerText);
		}
	}
	 public void enrollInCourse(int courseId)
	  {
		institute.enrollStudentInCourse(courseId, name);
	  }
	
}