package Oop_Day_11;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductDemo p= new ProductDemo();
		
		System.out.println("Emter the laptopBrand");
		p.laptopBrand=sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter the laptopprice");
		p.laptopPrice=sc.nextDouble();
		
		System.out.println("is touch scereen or not ");
		p.istouchscreen=sc.nextBoolean();
		p.getlaptopInformation();
		
		
		sc.close();
		
		

	}

}
