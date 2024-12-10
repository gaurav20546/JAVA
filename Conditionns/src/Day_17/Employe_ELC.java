package Day_17;

public class Employe_ELC {
	public static void main(String[] args) {
		Employee E1=new Employee("bharagav",21,"it",25000,"good");
		Employee E2=new Employee("ramya ",21,"it",25000,"average");
		
		
		E1.updateSalary();
		System.out.println(E1);
		
		E2.updateSalary();
		System.out.println(E2);
		
		E1.setAge(22);
		
		//System.out.println(E1.getAge());
		System.out.println(E1);
		
		
	}

}
