package New.m1;
//ELC
import java.util.Scanner;

public class GetSumOf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two digit no :");
		int no=sc.nextInt();
		int sum=SumOfTwoNumber.sumof(no);
		System.out.println("sum of two no "+sum);

	}

}
