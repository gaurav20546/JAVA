package OOP_Day_12;

public class Student_BLC {
	 private int StudentId;
	 private String StudentName;
	 private double StudentMarks;
	 private char StudentGrade;
	
	
	public void GetdataStudent(int StudentId,String StudentName,double StudentMarks,char StudentGrade)
	{
		this.StudentId=StudentId;
		this.StudentName=StudentName;
		this.StudentMarks=StudentMarks;
		this.StudentGrade=StudentGrade;
		
	}
	public void GetGrade()
	{
		if(StudentMarks>90)
		{
			StudentGrade='A';
		}
		else if(StudentMarks>=80 && StudentMarks<90)
		{
			StudentGrade='B';
		}
		
		else if(StudentMarks>=70 && StudentMarks<80)
		{
			StudentGrade='C';
		}
		else if(StudentMarks>=60 && StudentMarks<70)
		{
			StudentGrade='D';
		}
		else
		{
			StudentGrade='E';

		}
	}
	public void showStudntData()
	{
		System.out.println("Student id is "+StudentId);
		System.out.println("Student name is "+StudentName);
		System.out.println("Student marks is "+StudentMarks);
		System.out.println("Student Gradde is "+StudentGrade);
		
	}

}
