package interfacee;

import java.util.Scanner;

public class FindmissingPositive {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
		int positiveNO=0;
		int pos=0;
		System.out.println("Enter the no you want :");
		int no=sc.nextInt();
		
		for(int i=no;i!=0;i--)
		{
			System.out.println("Enter the  "+i +"numbers");//1 2 3 4 5
			if(no>positiveNO)
			{
				positiveNO=no;
			}
			else 
			{
				pos=no;
			}
		}
		System.out.println(pos);
		
	}

}
