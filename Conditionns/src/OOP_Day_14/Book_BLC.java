package OOP_Day_14;

public class Book_BLC {
	public String title;
	public String author ;
	public double price ;
	public Book_BLC(String title, String author, double price) {
		super();
		if(price>0)
		{
		this.title = title;
		this.author = author;
		this.price = price;
		} 
		else
		{
			System.out.println("Title:"+" Negative Price Book");
			System.out.println("Author:"+"No Author");
			System.out.println("price :"+price);
			System.exit(0);
		}
	}
	public void applyDiscount(double discount )
	{
		if(discount>0)
		{
		price=price*(discount/100);
		}
		else
			System.out.println(" Invalid discount percentage. ");
	}
	public void printDetails()
	{
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("price "+price);
	}


}
