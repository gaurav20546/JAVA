package scannerClass;

import java.util.Scanner;

public class SumOfirstNaturalNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no :");
		int num=scanner.nextInt();
		int sum=0,d=num;
		while(num!=0)
		{
			sum=sum+num;
			num--;
		}
		System.out.println("sum of first "+d+" Natural numbers "+sum);
	}

}
