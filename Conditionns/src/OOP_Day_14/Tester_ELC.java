package OOP_Day_14;

public class Tester_ELC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp_BLc E=new Emp_BLc (12,null,40000);
		
		if(E.salary>=60000)
		{
			System.out.println("devloper");
		}
		else if(E.salary>=40000 && E.salary<60000)
		{
			System.out.println("Designer");
		}
		else if(E.salary<40000)
		{
			System.out.println("tester");
		}

	}

}
