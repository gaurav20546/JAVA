package AbstractProgramms;

public class StudentTester {

	public static void main(String[] args) {
		students s=null;
		s=new ScienceStudent("rahul","hsc",56,58,95);
		System.out.println("science student percentage :"+s.getPercentage());
		System.out.println("count :"+s.getTotalNoStudents());
		
		System.out.println("==============================");
		s=new HistoryStudent("ganesh","ssc",98,99);
		System.out.println("Tester student percentage :"+s.getPercentage());
		System.out.println("count :"+s.getTotalNoStudents());
	}

}
