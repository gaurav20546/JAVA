package mutipleinheritance;

public class ebooks extends books{
	int bookprice;
	ebooks(String titel,String author,int bookprice)
	{
		super(titel,author);
		
		this.bookprice=bookprice;
	}

	public void displaybookprice()
	{
		super.displaybooks();
		System.out.println("books price are "+bookprice);
	}
}
