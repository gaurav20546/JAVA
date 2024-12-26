package interfacee;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner (System.in);
		int positiveNO=0;
		int pos=0;
		int nu=0;
		System.out.println("Enter the no you want :");
		int no=sc.nextInt();
		System.out.println("Enter the  "+1 +"numbers");//1 2 3 4 5
		int g=sc.nextInt();
		
		for(int i=no;i!=0;i--)
		{
			System.out.println("Enter the  "+i +"numbers");//1 2 3 4 5
			pos=sc.nextInt();
			g++;
			
			if(pos==g)
			{
				
			}
			
		}
		System.out.println(nu);
		
	}

}








/*
public class SecondLargest {

	public static void main(String[] args) {
		int no;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how ,ay no you want :");
		no=sc.nextInt();
		int FirstLar=0;
		int to1 = 0;
		int to2=0;
		int no1 = 0;
		while(no!=0)
		{
			System.out.println("enter the no :");
			 no1=sc.nextInt();
			
				if(no1 > FirstLar)
				{
					FirstLar=no1;

					if(no==4)
					{
						to2=no1;
					}
					
				}
				else 
				{
					if(FirstLar>no1)
					{
					to1=no1;
					System.out.println("b");
					}
					
					
				}
			
			no--;
		}
		if(to2<no1)
		{
			System.out.println("second is "+to2);
		}
		else 
		System.out.println("scond largest is "+to1);

	}

}*/

/*int firstlarge=-1;
 * int seconlarge=-1;
 * for(i=1;i<n;i++)
 * {
 * 	int t=sc.nextint();
 * 
 *  * 
 * }*/
