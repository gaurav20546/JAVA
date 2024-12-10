package New.m1;

import java.util.LinkedList;
import java.util.Scanner;

public class OddNumberLinkL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        // Accepting the number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Accepting numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        // Displaying only odd numbers
        System.out.println("Odd numbers in the list:");
       //using  normal loop
        for(int j=0;j<n;j++)
        {
        	int no=numbers.get(j);
        	if(j % 2 !=0)
        	{
        		System.out.println("odd no is :"+j);
        	}
        	else if(j % 2==0)
        	{
        		System.out.println("even no :"+j);
        	}
        }       
        
        //using for each loop
//        for (int number : numbers) {
//            if (number % 2 != 0) {
//                System.out.println(number);
//            }
//        }

        sc.close();
    }
}
