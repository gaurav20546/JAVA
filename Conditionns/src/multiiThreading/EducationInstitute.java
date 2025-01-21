package multiiThreading;

class EducationInstitute{
	private Course[] courses ;// An array to store the available courses.
	private Offer[] offers ;
	private int count;
	
	
	public EducationInstitute(Course[] courses,	Offer[] offers)
	{
		this.courses=courses;
		this.offers=offers;
	}
	
	public Course[] getcourses()
	{
		return courses;
		
	}
	public Offer[] getoffers()
	{
		return offers;
		
	}
	
	public int getcount()
	{
		return count;	
	}
	
	public void enrollStudentInCourse(int courseId, String studentName)
	{
		for(int i=0;i<courses.length;i++)
		{
			if(courseId==courses[i].getCourseId())
			{
				System.out.println(studentName+": enrolled in :"+courses[i].getCourseName());
			}
		}		
		
	}
		
		
	}
	
	