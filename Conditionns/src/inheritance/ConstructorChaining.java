package inheritance;
//) To access the super class constructor (Constructor Chaining) :
class Alphaa
{
	public Alphaa(String a)
	{
	super();
	System.out.println("parent Alpha class :"+a);
	}
	
}
class Betaa extends Alphaa
{
	Betaa()
	{
		super("gaurav");
		System.out.println("child Beta class");

	}
}
public class ConstructorChaining {
	public static void main(String[] args) {
		Betaa b=new Betaa();
		
	}

}
