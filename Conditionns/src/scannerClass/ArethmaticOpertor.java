package scannerClass;

import java.util.Scanner;

public class ArethmaticOpertor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the three digit number :");
		int num=sc.nextInt();
		int rem=num%10;
		System.out.print("The reverse no is :"+rem);
		num=num/10;
		rem=num%10;
		System.out.print(rem);
		num=num/10;
		sc.close();
		
		System.out.print(num);
		
	}
}
