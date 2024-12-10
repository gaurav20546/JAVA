package OOP_Day_14;

public class GetterSetter_ELC {
	public static void main(String[] args) {
		
		GetterAndSetter scott= new GetterAndSetter(4000);
		System.out.println(scott);
		
		System.out.println("After 1 year, Salary Updated");
		scott.setempSalary(scott.getempSalary()+50000);
		scott.getempSalary();
		
		System.out.println(scott);
		scott.setempSalary(scott.getempSalary()+2500);
		System.out.println(scott);
		
		
		
	}
}

