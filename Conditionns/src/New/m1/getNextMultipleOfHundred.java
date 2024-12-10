package New.m1;

import java.util.Scanner;

public class getNextMultipleOfHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no :");
		int no=sc.nextInt();
		int mul=NextMultipleOfHundred.Findmulti(no);
		System.out.println("next multiple is :"+mul);

	}

}
