package New;
/*reate Person Class:
--------------------
Implement a class with private fields for the name and an Address object.
Provide a constructor to initialize the name and address.
Implement a method to display the person's name and address.*/

public class Person {

	private String name;
	private Address Address;
	
	public  Person(String name,Address Address)
	{
		this.name=name;
		this.Address=Address;
	}
	public void Display()
	{
		System.out.println("Name :"+name);
		System.out.println(Address);
	}
	
}

