//
//
//SET A
//-----------------------------------------------------------------------------------------------------------------------
//Program 1 : ( 10 points )Multilevel Inheritance
//-----------------------------------------------------------------------------------------------------------------------
//University Staff Management System
//You are tasked with creating a system that models university staff members, with multiple levels of staff positions. The system will represent different staff roles and their specific responsibilities.
//
//Class Hierarchy:
//
//Staff Class (Base Class)
//
//Attributes:
//
//String name: Represents the name of the staff member.
//int id: Represents the unique ID of the staff member.
//
//Methods:
//
//Constructor to initialize the name and id attributes.
//
//void displayInfo(): Prints the staff member's name and ID.
//
//Faculty Class (Derived from Staff)
//
//Attributes:
//String department: Represents the department the faculty member belongs to.
//
//Methods:
//Constructor to initialize the name, id, and department.
//
//void teachSubject(): Prints the department the faculty member is teaching.
//
//Professor Class (Derived from Faculty)
//
//Attributes:
//
//String researchArea: Represents the research area of the professor.
//
//Methods:
//
//Constructor to initialize the name, id, department, and researchArea.
//
//void conductResearch(): Prints the research area of the professor.
//
//Task Requirements:
//
//Define the Staff, Faculty, and Professor classes based on the attributes and methods described above.
//Create a Main class that instantiates a Professor object with sample values (e.g., name, ID, department, and research area).
//Call the methods to demonstrate the functionality of each class.

package Multiple_inheritance;


class Staff
{
	String name ;
	int id;
	
	Staff(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public void displayInfo()
	{
		System.out.println("Staff name:"+name);
		System.out.println("Staff id :"+id);
	}
}
class Faculty extends Staff
{
	String department;
	Faculty(String name,int id,String department)
	{
		super(name,id);
		this.department=department;
		
	}
	public void teachSubject()
	{
		
		super.displayInfo();
		System.out.println("department faculty is teaching :"+department);
	}
	
}

 class Professor extends Faculty
 {
	 String researchArea;
	 Professor(String name,int id,String Faculty, String researchArea)
	 {
		 super(name,id,Faculty);
		 this.researchArea=researchArea;
		 
	 }
	 public void conductResearch()
	 {
		 
		 System.out.println("reserch area is :"+researchArea);
	 }
 }



public class University_StaffManagementSystem {

	public static void main(String[] args) {
		Professor p=new Professor("rajuAnna",01,"drawing","hydrabad");
		p.conductResearch();
		p.teachSubject();
	}
	
	
	
	
}
