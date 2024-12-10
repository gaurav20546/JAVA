package New.m1;

import java.util.Scanner;

public class sumOfRoundedValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no:");
		int no1=sc.nextInt();
		System.out.println("enter the first no2:");
		int no2=sc.nextInt();
		System.out.println("enter the first no3:");
		int no3=sc.nextInt();
		int total=RoundedSum.Findsum(no1,no2,no3);
		System.out.println("sum of toatal no :"+total);
	
	}

}
