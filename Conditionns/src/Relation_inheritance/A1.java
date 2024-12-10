package Relation_inheritance;
import java.util.Scanner;

class  A3{
	
	 int a=m1();//0
	 String p="ram";
	 
	  A3()
	 {
		 System.out.println("welcome "+p+" to method  A3 class "+a);
	
	 }
	 public int   m1()
	 {
	 	 System.out.println("welcome to A3 class");
	 	 return 220;
	 }
	 
}	
class A2 extends A3
	{
	 int a;
	 @Override
	 public int  m1()
	 {
		 return 20;
		 
	 }
		 A2(int x)
		{
			super();
			System.out.println("Welcome to A2 class "+super.a);
		}
	}

public class A1 {
	public static void main(String[] args)
	{	
		A3 a=new A3();
		//Scanner sc=new Scanner(System.in);

	}
	//

	}
