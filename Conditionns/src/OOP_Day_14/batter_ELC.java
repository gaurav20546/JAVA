package OOP_Day_14;

import java.util.Scanner;

public class batter_ELC {
	public static void main(String[] args) {
		Battaer B=new Battaer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter batter name ");
		String name=sc.nextLine();
		System.out.println("enter the run ");
		int run=sc.nextInt();
		System.out.println("enter the matches");
		int matches=sc.nextInt();
		B.batterDetails(name,run,matches);
		B.batting_avg(matches);
		sc.close();
	}

}
