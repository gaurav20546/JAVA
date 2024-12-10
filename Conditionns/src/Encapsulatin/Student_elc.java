package Encapsulatin;

public class Student_elc {
	public static void main(String[] args) {
		Student raj=new Student(11,"raj",70,"ameerpeth");
		System.out.println(raj);
		//Address Updated 
		raj.setStudentadd("ramanagar");
		System.out.println(raj);
		int marks =raj.getStudentmarks();
		if(marks >= 90)
		{
			System.out.println(raj.getStudentname()+" is Excellent in Subject");
			
		}
		else if(marks >= 75)
		{
			System.out.println(raj.getStudentname()+" is good in Subject");
		}
		else{
			System.out.println(raj.getStudentname()+" is good in Subject");
		}
		
	}

}
