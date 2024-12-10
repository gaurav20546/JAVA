package OOP_Day_14;

import java.util.Scanner;

public class Encapsulation_ELC {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your Id ");
		int id=sc.nextInt();
		//sc.nextLine();
		
		//sc.nextLine();
		System.out.println("enter your salary ");
		double Salary=sc.nextDouble();
		sc.nextLine();
		System.out.println("enter your name ");
		String name=sc.nextLine();
		Encapsulation_BLC E=new Encapsulation_BLC( id,name,Salary);
		
		
		
		System.out.println(E);
//		E.setName("gaurav");
//		E.setSalary(85000);
//		System.out.println(E);
		double sal = E.getSalary();
		if (sal>50000)
		{
			System.out.println(E.getName()+" is a good employee");
		}
		else if (sal>70000)
		{
			System.out.println(E.getName()+" is a good employee ");
			
		}
		else if(sal<=50000)
		{
			System.out.println(E.getName()+" is a not goood");

		}
		else 
		{
			System.out.println(E.getName()+"is a Exelnet");
		}
		
		
		
		
		sc.close();
	}
}
