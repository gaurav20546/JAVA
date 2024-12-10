package mutipleinheritance;

public class SceinceStudent extends student{
	private int physicsMarks;
	private int mathMarks;
	private int chemistryMarks;
	SceinceStudent(String sName, int rollNo,int physicsMarks,int mathMarks,int chemistryMarks) {
		super(sName, rollNo);
		this.chemistryMarks=chemistryMarks;
		this.mathMarks=mathMarks;
		this.physicsMarks=physicsMarks;
	}
	public void displayDetails()
	{
		System.out.println("SName :"+super.sName);
		System.out.println("RollNO :"+super.rollNo);
		System.out.println("physics :"+this.physicsMarks);
		System.out.println("chemistry :"+this.chemistryMarks);
		System.out.println("math :"+this.mathMarks);
		System.out.println("persentage :"+calculatePercentage());
		
	}
	public double calculatePercentage()
	{
		float per;
		per=this.chemistryMarks+this.mathMarks+this.physicsMarks;
		return per/3;
		
	}
	
}
