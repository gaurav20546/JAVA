package New.m1;
import java.util.LinkedList;
//import java.util.Scanner;
import java.util.Scanner;

public class RevereseLink {
	public static void main(String [] args )
	{
		Scanner  sc=new Scanner(System.in);
		LinkedList<String> string=new LinkedList();
		
		System.out.println("enter the how man names:");
		int t=sc.nextInt();
		
		System.out.println("enter the names ");
		
		for(int i=t;i>=0;i--)
		{
			string.add(sc.nextLine());
			
		}
		
		System.out.println("name are :");
		for(int i=string.size()-1;i>0;i--)
		{
			System.out.println(string.get(i));
		}
		
		
		
		
	
	}

}
