package multiiThreading;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args)
	{
		table t = new table();
		Thread t1=new Thread()
		{
				@Override
				public void run()
				{
				
					Scanner sc =new Scanner(System.in);
					System.out.println("enter the number to print for table");
					int num=sc.nextInt();
					t.printtable(num);
					
				}
		};
		t1.start();
	}
	
	
}

class table
{

	public void printtable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(num*i);
		}
		
	}
	
}