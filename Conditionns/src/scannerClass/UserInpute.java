package scannerClass;
import java.util.*;

public class UserInpute {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your first  name :");
		String le=scanner.next();
		
		System.out.println("enter the  short id :");
		byte b=scanner.nextByte();
		
		System.out.println("enter the money to donate:");
		double mo=scanner.nextDouble();
		
		// Consume the leftover newline after nextDouble()
		scanner.nextLine();//Clears the buffer
		
		System.out.println("Enter after first name :");
		String name=scanner.nextLine();
		
		System.out.println("Enter your age :");
		int age=scanner.nextInt();
		
		System.out.println("first name is"+le+" \nid is "+b+"\n mony is "+mo+" \n your name is "+name +"\n age is "+age );
		
		System.out.println("enter your weigth :");
		float we=scanner.nextFloat();
		System.out.println("your weight is :"+we);
		
		System.out.println("enter the first letter name :");
		char first=scanner.next().charAt(0);
		System.out.println("your name first letter is "+first);
		
		
		
		
		
	}

}
