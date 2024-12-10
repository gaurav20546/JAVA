package AbstractProgramms;

public class ScienceStudent extends students{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	public ScienceStudent(String studentName,String studentClass,int physicsMarks,int chemistryMarks,int mathsMarks)
	{
		super(studentName,studentClass);
		this.physicsMarks=physicsMarks;
		this.chemistryMarks=chemistryMarks;
		this.mathsMarks=mathsMarks;
		
	}
	@Override
	public int getPercentage() {
		int percentage =physicsMarks+chemistryMarks+mathsMarks;
		percentage=percentage/3;
		
		return percentage ;
	}
	
	

}
