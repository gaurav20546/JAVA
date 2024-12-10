package Encapsulatin;

public class Student {
	private int studentId;
	private String studentname;
	private int studentmarks;
	private String studentadd;
	
	public Student(int studentId, String studentname, int studentmarks, String studentadd) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.studentmarks = studentmarks;
		this.studentadd = studentadd;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", studentmarks=" + studentmarks
				+ ", studentadd=" + studentadd + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getStudentmarks() {
		return studentmarks;
	}

	public void setStudentmarks(int studentmarks) {
		this.studentmarks = studentmarks;
	}

	public String getStudentadd() {
		return studentadd;
	}

	public void setStudentadd(String studentadd) {
		this.studentadd = studentadd;
	}
	
	

}
