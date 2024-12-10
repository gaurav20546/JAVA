package Oop_Day_11;

import java.util.Scanner;

public class behaviour {
	int productId ;
	String productName ;
	double productPrice ;
	
	public void show( )
	{
		System.out.println("product id is "+productId);
		System.out.println("product Name is "+productName);
		System.out.println("product price is "+productPrice);
		
		
	}
	public void setFeilds( )
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Product Id : ");
	    productId= sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter Product Name : ");
	    productName= sc.nextLine();
	    System.out.println("Enter Product price : ");
	    productPrice= sc.nextInt();
	    sc.close();
		
		
	}

}
