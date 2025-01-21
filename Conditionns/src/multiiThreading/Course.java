package multiiThreading;

class Course
{
	int courseId;
	String courseName;
	double corseFee ;
	
	public Course(int courseId,String courseName,double corseFee )
	{
		this.courseId=courseId;
		this.courseName=courseName;
		this.corseFee=corseFee;
	}

	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public double getCorseFee() {
		return corseFee;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", corseFee=" + corseFee + "]";
	}
}


/*Problem Statement:

You are tasked with creating an education institute course enrollment system using Java. The system should provide courses and offers to students, allowing them to view available courses, ongoing offers, and enroll in their preferred courses.

Classes:
Take one BLC class Course

Attributes:

-> courseId (int): Unique identifier for the course.

-> courseName (String): Name of the course.

-> corseFee (double): Fee for the course.



Methods:

-> Parameterized Constructor to initialize the instance variable.

-> Generate getters for all field

-> Override toString() method*/