package AbstractProgramms;

public class HistoryStudent extends students {
	private int historyMarks;
	private int civicsMarks;
	HistoryStudent(String studentName,String studentClass,int historyMarks,int civicsMarks)
	{
		super(studentName,studentClass);
		this.historyMarks=historyMarks;
		this.civicsMarks=historyMarks;
	}
	
	
	@Override
	public int getPercentage() {
		int percentage =historyMarks+civicsMarks;
		percentage=percentage/2;
		
		return percentage ;
	}
	

}
