package mutipleinheritance;

public class ArtsStudent  extends student {
	private int histryMarks;
	private int geographyMarks;
	private int englishMarks;
	ArtsStudent(String sName,int rollNo,int histryMarks, int geographyMarks,int englishMarks)
	{
		super(sName , rollNo);
		this.histryMarks=histryMarks;
		this.geographyMarks=geographyMarks;
		this.englishMarks=englishMarks;
		
	}
	public void display()
	{
		System.out.println("SName :"+super.sName);
		System.out.println("RollNO :"+super.rollNo);
		System.out.println("physics :"+this.geographyMarks);
		System.out.println("chemistry :"+this.histryMarks);
		System.out.println("math :"+this.englishMarks);
		System.out.println("persentage :"+calculatePercentage());
	}
	public double calculatePercentage()
	{
		double per=this.englishMarks+this.geographyMarks+this.histryMarks;
		return per/3;
	}

}
