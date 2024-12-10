package Oop_Day_11;

public class Parameter_ELC {
	public static void main(String[] args) 
	{
		System.out.println("==========================================");
		RefrenceVariable scott = new RefrenceVariable();
		scott.setEmployeeData(111, "Scott", 55000, "S R Nagar");
		scott.getEmployeeData();
		
		System.out.println("==========================================");
		RefrenceVariable   smith = new RefrenceVariable ();
		smith.setEmployeeData(222, "Smith", 56000, "Ameerpet");
		smith.getEmployeeData();
		
		System.out.println("==========================================");
		RefrenceVariable jen =new RefrenceVariable();
		jen.setEmployeeData(333, "jen", 55000, "S R Nagar");
		jen.getEmployeeData();
		System.out.println("==========================================");
	}

}
