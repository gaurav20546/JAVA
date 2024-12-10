package mutipleinheritance;

public class books extends items {
	String author;
	books(String titel,String author)
	{
		super(titel);
		this.author=author;
	}
	public void displaybooks()
	{
		super.displayitem();
		System.out.println("Book aithor:"+author);
	}

}
