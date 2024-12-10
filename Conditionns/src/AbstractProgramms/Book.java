package AbstractProgramms;

public abstract class Book {
	String title;
	
	 public abstract void setTitle1(String title);
	
	public String getTitle() {

		return title;
	}

}
class Mybook extends Book
{
	@Override
	 public void setTitle1(String title)
	 {
		this.title=title;
	 }
	@Override
	public String getTitle()
	{
		return title;
	}
}
