package scannerClass;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the the no you want even up to");
		int num=sc.nextInt();
		int i=1;
		while(i!=num)
		{
			if(i%2==0)
			{
				System.out.println(+i);
			}
			i++;
			
		}
		
	}
}
