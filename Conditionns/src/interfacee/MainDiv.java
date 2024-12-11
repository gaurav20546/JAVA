package interfacee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDiv {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no :");
		int num=0;
		try {
			num=sc.nextInt();
		}
		catch(InputMismatchException i)
		{
			System.err.println("Enter the NO not Char :");
			System.exit(0);
		}
		AdvancedArithmetic v=new  MyCalculator();
		System.out.println(v.divisorSum(num));
		

	}

}
