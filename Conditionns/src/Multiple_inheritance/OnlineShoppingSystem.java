
//--------------------------------------------------------------------------------------------------------------------------------
//Program 2 : ( 10 points)Hierarchical Inheritance
//------------------------------------------------------------------------------------------------------------------------------------
//
//Problem: Online Shopping System
//
//You are building an Online Shopping System, and you need to create a class hierarchy to represent different types of products that customers can purchase. You will be implementing a set of classes that model the products and their attributes. The focus of this problem is to demonstrate the use of inheritance and method overriding in Java.
//
//Follow the provided code as a base, and create the necessary classes to satisfy the requirements below:
//
//  Create a class named Product:
//
//    It should have protected instance variables name (String) and price (double).
//    Implement a constructor that initializes the name and price.
//    Define a method displayInfo() that prints the product's name and price.
//    Define a method calculateTotalCost(int quantity) that calculates and returns the total cost of purchasing a given quantity of the product.
//
//  Create a subclass named Electronics:
//    Extend the Product class.
//
//    Add a private instance variable brand (String).
//    Implement a constructor that takes name, price, and brand as parameters and initializes the superclass constructor.
//    Define a method displayInfo() method to additionally print the product's brand.
//
//  Create another subclass named Clothing:
//    Extend the Product class.
//
//    Add a private instance variable size (String).
//    Implement a constructor that takes name, price, and size as parameters and initializes the superclass constructor.
//    Define a method displayInfo() method to additionally print the product's size.
//
//  Create a class named OnlineShopping (as provided in the code):
//
//    In the main method, create instances of both Electronics and Clothing with appropriate values.
//    Print information about each product, including their specific attributes.
//    Calculate and print the total cost for a given quantity of each product.
//
//Your task is to implement the required classes based on the provided problem description. This will help you practice inheritance concepts.

package Multiple_inheritance;


	
	
	
class product
{
	String pName;
	double pPrice;
	product(String pName,double pPrice)
	{
		this.pName=pName;
		this.pPrice=pPrice;
	}
	
	public void displayInfo() 
	{
		System.out.println("product name:"+pName);
		System.out.println("product price :"+pPrice);
		
	}

	public double calculateTotalCost(int quantity) 
	{
		double total=quantity*pPrice;
		
		return total;
	}

}
class clothing  extends product
{	String size;
	clothing(String pName,double pPrice,String size)
	{
		super(pName , pPrice);
		this.size=size;
	}
	public void  displayInfo()
	{
		super.displayInfo();
		System.out.println("priduct size:"+size);
	}
}


class Electronics extends product{

	private String brand;
	Electronics(String pName, double pPrice,String brand) 
	{
		super(pName, pPrice);
		this.brand=brand;
		
	}
	public void displayInfo()
	{
		System.out.println("product name:"+pName);
		System.out.println("product price :"+pPrice);
		System.out.println("barnd is "+brand);
	}
	
}
public class OnlineShoppingSystem {
	
	public static void main(String[] args) {
		clothing c=new clothing("hydra",500,"M");
		System.out.println("total price "+c.calculateTotalCost(10));
		c.displayInfo();
	
		System.out.println("====================================================");
		Electronics e=new Electronics("led",100,"Syska");
		e.displayInfo();
	}
	
}
