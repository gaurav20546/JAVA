package New.m1;
//ELC
import java.util.Scanner;

public class FetDiffOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the two digit no :");
		int no=sc.nextInt();
		int diff=TwoDigitsDifference.diffBtw(no);
		System.out.println("sum of two no "+diff);
}
}