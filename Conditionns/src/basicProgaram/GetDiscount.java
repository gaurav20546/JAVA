package basicProgaram;

import java.util.Scanner;

public class GetDiscount {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("if you have a membership then enter YES/NO");
		String ask=sc.nextLine();
		char p=ask.charAt(0);
		boolean b;
		if(p=='y' || p=='Y')
		{
			 b=true;
		}
		else 
		{
			 b=false;
			
		}
		
		 //boolean b = ask.toLowerCase().charAt(0) == 'p';
		if(b)
		{
			System.out.println("congrachualtion .enter your age .");
			{
				int age=sc.nextInt();
				if(age>19 )
				{
					System.out.println("Discount id 20%");
				}
				else if(age>50)
				{
					System.out.println("Discount is 50% ");
				}
				else 
				{
					System.err.println("age problem");
				}
				
			}
		}
		else 
		{
			System.out.println("get membership");
		}
		sc.close(); 
		
	}

}
